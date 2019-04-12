package database.services.user;


import database.entities.UsersEntity;

import java.util.List;

public interface UserService {
    public void saveUser(String name , String sname , String fname);
    public List<UsersEntity> getAllUsers();
}
