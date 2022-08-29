package com.ICONPLN.training.service;

import com.ICONPLN.training.model.User;
import com.ICONPLN.training.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    //Todo : Get Data
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    //Todo : Save Data
    public String createUser(User user) {
        User getUser = userRepository.findByUsername(user.getUsername());
        if (getUser != null) {
            return "User already exists";
        } else {
            userRepository.save(user);
            return "User created successfully";
        }
    }

    //Todo : Update Data
    public String updateUser(Integer id,User user) {
        User userToUpdate = userRepository.findById(id).orElseThrow(null);
        if (userToUpdate != null){
                userToUpdate.setUsername(user.getUsername()!=null?user.getUsername():userToUpdate.getUsername());
                userToUpdate.setPassword(user.getPassword()!=null?user.getPassword():userToUpdate.getPassword());
                userToUpdate.setIS_ACTIVE(user.getIS_ACTIVE()!=null?user.getIS_ACTIVE():userToUpdate.getIS_ACTIVE());
                userRepository.save(userToUpdate);
                return "Data Terupdate";
        }else {
            return "data tidak ditemukan";
        }

    }

    //Todo : Delete Data
    public void  deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

}
