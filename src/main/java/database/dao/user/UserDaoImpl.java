package database.dao.user;

import database.entities.UsersEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveUser(String name, String sname, String fname) {
        UsersEntity user = new UsersEntity();
        user.setName(name);
        user.setSname(sname);
        user.setFathername(fname);
        this.sessionFactory.getCurrentSession().save(user);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<UsersEntity> getAllUsers() {
        List<UsersEntity> users = sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM USERS").addEntity(UsersEntity.class).list();
        return users;
    }
}
