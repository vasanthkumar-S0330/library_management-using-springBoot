package com.libraryms.library.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryms.library.dal.IBorrowDAO;

@Service
public class BorrowService {
   
    @Autowired
    IBorrowDAO borrow;

    public String borrowBook(String memberId, String isbn){
        return borrow.borrowBook(memberId, isbn);
    }

    public String returnBook(String memberId, String isbn){
        return borrow.returnBook(memberId, isbn);
    }
}
