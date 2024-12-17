package com.libraryms.library.dal;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.libraryms.library.model.Book;
@Repository
public interface IBookDAO {
    void addBook(Book book);
    List<Book> getAllBooks();
    Book getBookByISBN(String isbn);
    void updateBook (Book book,String isbn);
    void deleteBook(String isbn);
}
