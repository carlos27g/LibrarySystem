package LibrarySystem.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Library {

    @Id
    private int id;

    @OneToMany(mappedBy = "library", cascade = CascadeType.PERSIST)
    private List<Book> books;


    public Library() {
        books = new ArrayList<>();
    }

    //Methods
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Book rentBook(Book book) {
        for (Book b : books) {
            if (b.equals(book)) {
                if (b.isRented()) {
                    System.out.println("This book is already rented");
                }
                b.setRented(true);
                return b;
            }
        }
        System.out.println("Book could not be founded");
        return null;
    }

    public void returnBook(Book book) {
        for(Book b: books){
            if (b.equals(book)) {
                b.setRented(false);
            }
        }
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }


}
