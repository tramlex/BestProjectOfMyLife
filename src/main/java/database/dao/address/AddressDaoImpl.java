package database.dao.address;

import database.entities.AddressEntity;
import database.entities.UsersEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AddressDaoImpl implements AddressDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveAddress(String street, String house, String room) {
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setStreet(street);
        addressEntity.setHouse(house);
        addressEntity.setRoom(room);
        this.sessionFactory.getCurrentSession().save(addressEntity);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<AddressEntity> getAllAddresses() {
        List<AddressEntity> addresses = sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM ADDRESS ").addEntity(AddressEntity.class).list();
        return addresses;
    }


    @Override
    public void setUserToAddress(int userId, int addressId) {
        AddressEntity addressEntity = sessionFactory.getCurrentSession().find(AddressEntity.class, addressId);
        UsersEntity usersEntity = sessionFactory.getCurrentSession().find(UsersEntity.class,userId);
        addressEntity.setUser(usersEntity);
        this.sessionFactory.getCurrentSession().update(addressEntity);
    }

}
