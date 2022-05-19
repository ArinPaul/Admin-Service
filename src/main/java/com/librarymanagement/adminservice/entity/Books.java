package com.librarymanagement.adminservice.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "books")
public class Books {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "author_name")
    private String authorName;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "publication_date")
    private String publicationDate;

    @Column(name = "genre")
    private String genre;

    public Books() {
    }

    public Books(String bookName, String authorName, String publisher, String isbn, String publicationDate, String genre) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisher = publisher;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publicationDate=" + publicationDate +
                ", genre='" + genre + '\'' +
                '}';
    }
}
