
package upeu.edu.com.ecommerce_v2.infraestructura.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String firtsName;
    private String lastName;
    private String email;
    private String adress;
    private String cellphone;
    private String password;
    private LocalDateTime dateCreated;
    @Enumerated(EnumType.STRING)
    @JoinColumn(name="usertype")
    private TypeUser typerUser;
    public UserEntity() {
    }

    public UserEntity(Integer id, String username, String firtsName, String lastName, String email, String adress, String cellphone, String password, LocalDateTime dateCreated, TypeUser typerUser) {
        this.id = id;
        this.username = username;
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.email = email;
        this.adress = adress;
        this.cellphone = cellphone;
        this.password = password;
        this.dateCreated = dateCreated;
        this.typerUser = typerUser;
    }

   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public TypeUser getTyperUser() {
        return typerUser;
    }

    public void setTyperUser(TypeUser typerUser) {
        this.typerUser = typerUser;
    }
    
}
