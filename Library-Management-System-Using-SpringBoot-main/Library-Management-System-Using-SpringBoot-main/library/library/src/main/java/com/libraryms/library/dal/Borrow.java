package com.libraryms.library.dal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.libraryms.library.model.Book;
import com.libraryms.library.model.Member;
@Repository
public class Borrow implements IBorrowDAO {

     private static final int MAX_BORROW_LIMIT = 3;

    @Autowired
    private IBookDAO bookDAO;

    @Autowired
    private IMemberDAO memberDAO;

    @Override
    public String borrowBook(String memberId, String isbn){
     Member member = memberDAO.getMemberById(memberId);
        Book book = bookDAO.getBookByISBN(isbn);

        if (book == null || !book.isAvailable()) {
            return "Book not available!";
        }

        if (member.getBorrowedBooks().size() >= MAX_BORROW_LIMIT) {
            return "Borrow limit reached!";
        }

        book.setAvailable(false);
        member.getBorrowedBooks().add(isbn);
        return "Book borrowed successfully!";
    }

    @Override
    public String returnBook(String memberId, String isbn){
        Member member = memberDAO.getMemberById(memberId);
        Book book = bookDAO.getBookByISBN(isbn);

        if (!member.getBorrowedBooks().contains(isbn)) {
            return "Invalid return!";
        }

        book.setAvailable(true);
        member.getBorrowedBooks().remove(isbn);
        return "Book returned successfully!";
    }
}
