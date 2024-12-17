package com.libraryms.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryms.library.dal.IBookDAO;
import com.libraryms.library.model.Book;
@Service
public class BookService {
    
    @Autowired
    private IBookDAO bookDAO;

    public List<Book> getAllBooks(){
        return bookDAO.getAllBooks();
    }

    public Book getBookByISBN(String isbn){
        return bookDAO.getBookByISBN(isbn);
    }

    public void addBook(Book book){
        bookDAO.addBook(book);
    }

    public void updateBook(Book book , String isbn){
        bookDAO.updateBook(book,isbn);
    }

    public void deleteBook(String isbn){
        bookDAO.deleteBook(isbn);
    }

    
}
