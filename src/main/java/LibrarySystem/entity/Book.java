package LibrarySystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
public class Book implements Serializable {

    @Id
    private int id;

    @NotBlank
    private String tittle;

    private String Author;
    private String Year;
    private String Section;
    private boolean rented;

    public Book(String tittle, String author, String year, String section) {
        this.tittle = tittle;
        Author = author;
        Year = year;
        Section = section;
        rented = false;
    }

    public Book() {
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
}
