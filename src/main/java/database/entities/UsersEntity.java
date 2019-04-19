package database.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USERS")
public class UsersEntity
{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,
            generator="users_seq")
    @SequenceGenerator(name="users_seq",
            sequenceName="SEQ_USER",
            allocationSize=5)
    @Column(name="id", updatable=false, nullable=false)
    private Integer  id;

    @Column (name="name", nullable=true)
    private String name;

    @Column (name="sname")
    private String  sname;

    @Column (name="fathername")
    private String  fathername;


    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "usersEntity",
            cascade = CascadeType.ALL)
    private List<AddressEntity> addressEntities;

    public UsersEntity() {}

    public UsersEntity(Integer id, String sname, String name , String fathername)
    {
        super();
        this.id    = id;
        this.sname = sname;
        this.name  = name;
        this.fathername = fathername;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    @Column
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }

    @Column (name="name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "fathername")
    public String getFathername(){
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public List<AddressEntity> getAddressEntities() {
        return addressEntities;
    }
    public void setAddressEntities(List<AddressEntity> addressEntities) {
        this.addressEntities = addressEntities;
    }

}
