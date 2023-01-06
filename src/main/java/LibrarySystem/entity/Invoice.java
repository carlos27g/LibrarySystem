package LibrarySystem.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Invoice implements Serializable {
    @Id
    private int id;

    @OneToOne
    private Book book;

    @OneToOne
    private Library library;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Student student;

    @Column
    private LocalDate beginnDate;
    @Column
    private LocalDate endDate;

    public Invoice(Book book, Student student, LocalDate beginnDate, LocalDate endDate) {
        this.book = book;
        this.student = student;
        this.beginnDate = beginnDate;
        this.endDate = endDate;
    }

    public Invoice() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public LocalDate getBeginnDate() {
        return beginnDate;
    }

    public void setBeginnDate(LocalDate beginnDate) {
        this.beginnDate = beginnDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
