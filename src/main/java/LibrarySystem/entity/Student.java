package LibrarySystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Student extends Person {

    private boolean studentCardValid;

    @OneToMany(mappedBy = "student", cascade = CascadeType.PERSIST)
    private List<Invoice> invoices;

    public Student(String name, LocalDate birthday, boolean studentCardValid) {
        super(name, birthday);
        this.studentCardValid = studentCardValid;
    }

    public Student() {
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> rentals) {
        this.invoices = rentals;
    }

    public boolean isStudentCardValid() {
        return studentCardValid;
    }

    public void setStudentCardValid(boolean studentCardValid) {
        this.studentCardValid = studentCardValid;
    }
}
