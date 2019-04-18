package database.dao.address;


import database.entities.AddressEntity;
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
        System.out.println("addresses == " + addresses);
        return addresses;
    }

    @Override
    public void setUserToAddress(int UserId, int AddressId) {
        AddressEntity Address = sessionFactory.getCurrentSession().find(AddressEntity.class, AddressId);
        Address.setUserId(UserId);
        this.sessionFactory.getCurrentSession().update(Address);
    }

}
