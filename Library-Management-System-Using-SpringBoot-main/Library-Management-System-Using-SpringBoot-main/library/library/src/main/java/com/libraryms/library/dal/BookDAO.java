package com.libraryms.library.dal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.libraryms.library.model.Book;

@Repository
public class BookDAO implements IBookDAO{
    private final Map<String, Book> bookCatalog = Collections.synchronizedMap(new HashMap<>());

    @Override
    public void addBook(Book book){
        bookCatalog.put(book.getIsbn(),book);
    }

    @Override
    public List<Book> getAllBooks(){
        return new ArrayList<>(bookCatalog.values());
    }

    @Override
    public void updateBook(Book book,String isbn) {
        
        if(bookCatalog.containsKey(isbn)) {
            book.setIsbn(isbn);
            bookCatalog.put(isbn, book);
        }
        
    }

    @Override
    public void deleteBook(String isbn) {
        bookCatalog.remove(isbn);
    }

    @Override
    public Book getBookByISBN(String isbn) {
        return bookCatalog.get(isbn);
    }
}
