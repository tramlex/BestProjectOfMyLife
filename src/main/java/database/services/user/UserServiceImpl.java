package database.services.user;

import database.dao.user.UserDao;
import database.entities.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void saveUser(String name, String sname, String fname) {
        userDao.saveUser(name, sname, fname);
    }

    @Override
    @Transactional
    public List<UsersEntity> getAllUsers() {
        return userDao.getAllUsers();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
