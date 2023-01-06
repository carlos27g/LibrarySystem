package LibrarySystem.entity;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Employee extends Person {


    private String userName;
    private String Password;

    public Employee(String name, LocalDate birthday, String userName, String password) {
        super(name, birthday);
        this.userName = userName;
        Password = password;
    }

    public Employee() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
