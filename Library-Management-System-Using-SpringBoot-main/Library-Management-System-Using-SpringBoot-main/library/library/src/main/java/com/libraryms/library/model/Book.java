package com.libraryms.library.model;

import jakarta.persistence.Id;

public class Book {
    @Id
    private String title;
    private String isbn;
    private String author;
    private int publicationYear;
    private boolean available = true;
    
    public Book(String author, String isbn, int publicationYear, String title) {
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.title = title;
    }

    public Book(){
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book{");
        sb.append("title=").append(title);
        sb.append(", isbn=").append(isbn);
        sb.append(", author=").append(author);
        sb.append(", publicationYear=").append(publicationYear);
        sb.append(", available=").append(available);
        sb.append('}');
        return sb.toString();
    }
}
