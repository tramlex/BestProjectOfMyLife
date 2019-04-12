package database.dao.user;

import database.entities.UsersEntity;

import java.util.List;

public interface UserDao {
    public void saveUser(String name , String sname , String fname);
    public List<UsersEntity> getAllUsers();
}
