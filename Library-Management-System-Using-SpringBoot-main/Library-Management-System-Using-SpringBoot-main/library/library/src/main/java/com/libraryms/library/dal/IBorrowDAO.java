package com.libraryms.library.dal;

import org.springframework.stereotype.Repository;

@Repository

public interface IBorrowDAO {
    public String borrowBook(String memberId, String isbn);
    public String returnBook(String memberId, String isbn);
}
