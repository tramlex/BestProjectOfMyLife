package database.dao.address;

import database.entities.AddressEntity;

import java.util.List;

public interface AddressDao {
    public void saveAddress(String street , String house , String room);
    public List<AddressEntity> getAllAddresses();
    public void setUserToAddress(int UserId , int AddressId);
}
