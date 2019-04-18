package database.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USERS", schema = "PUBLIC", catalog = "TEST")
public class UsersEntity {
    private int id;
    private String fathername;
    private String name;
    private String sname;

    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "user",
            cascade = CascadeType.ALL)
    private List<AddressEntity> addressEntities;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
    @SequenceGenerator(name = "users_seq", sequenceName = "SEQ_USER", allocationSize = 5)
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FATHERNAME", nullable = true, length = 255)
    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "SNAME", nullable = true, length = 255)
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (id != that.id) return false;
        if (fathername != null ? !fathername.equals(that.fathername) : that.fathername != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (fathername != null ? fathername.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        return result;
    }
}
