package libraryZone.book;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Book implements Comparable<Book> {

    private long id;
    private String title;
    private String author;
    private String genre;
    private String subgenre;
    private String publisher;
    private int counter = 0;

    public Book(long id, String title, String author, String genre, String subgenre, String publisher, int counter) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.subgenre = subgenre;
        this.publisher = publisher;
        this.counter = counter;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSubgenre() {
        return subgenre;
    }

    public void setSubgenre(String subgenre) {
        this.subgenre = subgenre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String toJson() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", subgenre='" + subgenre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", counter=" + counter +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return (int) (this.getId() - o.getId());
    }

}
