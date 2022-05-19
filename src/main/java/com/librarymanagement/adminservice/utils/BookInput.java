package com.librarymanagement.adminservice.utils;

public class BookInput {

    private String bookName;
    private String authorName;
    private String publisherName;
    private String isbn;
    private String genre;
    private String yearOfPub;

    public BookInput(String bookName, String authorName, String publisherName, String isbn, String genre, String yearOfPub) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.isbn = isbn;
        this.genre = genre;
        this.yearOfPub = yearOfPub;
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

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYearOfPub() {
        return yearOfPub;
    }

    public void setYearOfPub(String yearOfPub) {
        this.yearOfPub = yearOfPub;
    }


}
