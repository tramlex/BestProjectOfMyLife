package database.services.address;

import database.dao.address.AddressDao;
import database.entities.AddressEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressDao addressDao;

    @Override
    @Transactional
    public void saveAddress(String street, String house, String room) {
        addressDao.saveAddress(street, house, room);
    }

    @Override
    @Transactional
    public List<AddressEntity> getAllAddresses() {
        return addressDao.getAllAddresses();
    }

    @Override
    @Transactional
    public void setUserToAddress(int userId, int addressId) {
        addressDao.setUserToAddress(userId, addressId);
    }
}
