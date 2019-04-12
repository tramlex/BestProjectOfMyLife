package database.entities;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS", schema = "PUBLIC", catalog = "TEST")
public class AddressEntity {
    private int aid;
    private String house;
    private String room;
    private String street;
    private Integer userId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id" , nullable = false)
    private UsersEntity usersEntity;

    @Id
    @Column(name = "AID", nullable = false)
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Basic
    @Column(name = "HOUSE", nullable = true, length = 32)
    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    @Basic
    @Column(name = "ROOM", nullable = true, length = 32)
    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Basic
    @Column(name = "STREET", nullable = true, length = 64)
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "USER_ID", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddressEntity that = (AddressEntity) o;

        if (aid != that.aid) return false;
        if (house != null ? !house.equals(that.house) : that.house != null) return false;
        if (room != null ? !room.equals(that.room) : that.room != null) return false;
        if (street != null ? !street.equals(that.street) : that.street != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aid;
        result = 31 * result + (house != null ? house.hashCode() : 0);
        result = 31 * result + (room != null ? room.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }
}
