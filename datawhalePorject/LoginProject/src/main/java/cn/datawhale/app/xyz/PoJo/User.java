package cn.datawhale.app.xyz.PoJo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name="user")
public class User implements Serializable {
    @Id
    String id;
    String name;
    String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
    }

}
