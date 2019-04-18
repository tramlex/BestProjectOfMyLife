package database.services.address;

import database.entities.AddressEntity;

import java.util.List;

public interface AddressService {
    public void saveAddress(String street, String house, String room);

    public List<AddressEntity> getAllAddresses();

    public void setUserToAddress(int userId, int addressId);
}
