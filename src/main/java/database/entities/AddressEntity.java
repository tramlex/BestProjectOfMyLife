package database.entities;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
public class AddressEntity
{
    @Id
    @GeneratedValue    (strategy=GenerationType.SEQUENCE,
            generator="users_seq")
    @SequenceGenerator (name="users_seq",
            sequenceName="SEQ_USER",
            allocationSize=5)
    @Column (name="aid")
    private Integer id;

    @ManyToOne (fetch=FetchType.LAZY,
            cascade=CascadeType.ALL)
    @JoinColumn (name="user_id")
    private UsersEntity usersEntity;

    @Column(name = "room")
    private String room;

    @Column(name = "street")
    private String street;

    @Column(name = "house")
    private String house;

    public AddressEntity()
    {
        super();
    }
    public AddressEntity(Integer id, UsersEntity usersEntity, String room , String street , String house)
    {
        super();
        this.id = id;
        this.usersEntity = usersEntity;
        this.room = room;
        this.street = street;
        this.house = house;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public UsersEntity getUsersEntity() {
        return usersEntity;
    }
    public void setUsersEntity(UsersEntity usersEntity) {
        this.usersEntity = usersEntity;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getHouse() {
        return house;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRoom() {
        return room;
    }
}
