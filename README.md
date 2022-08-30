
# Post Test

Training Java Sprin Boot dan Oracle




## Documentation
This app created with 
- Java 11
- Maven 3.10
- Oracle Database 

### Library used
- Spring WEB
- JPA
- Oracle Driver

### Run Localy
```bash
mvn spring-boot:run
```

## API Reference


|Metode   |URL                    |Tipe                  |Deskripsi                |
|:------  |:--------------------- |:-------------------- |:----------------------- |
| GET     | `/user`               |                      | Get All User            |
| POST    | `/user`               | User                 | Insert User             |
| PUT     | `/user/${id}`         | Integer / User       | Update User             |
| DELETE  | `/user/${id}`         | Integer              | Delete User             |


### User 

```json
{
    "username" : "username",
    "password" : "password",
    "is_ACTIVE" : 1
}
```