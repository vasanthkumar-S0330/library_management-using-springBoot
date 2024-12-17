package com.libraryms.library.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Id;

public class Member {
    @Id
    private String memberId;
    private String name;
    private String contactInfo;
    private List<String> borrowedBooks = new ArrayList<>();

    public Member(String contactInfo, String memberId, String name) {
        this.contactInfo = contactInfo;
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }
    
    public Member(){
        this.borrowedBooks = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<String> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Member{");
        sb.append("memberId=").append(memberId);
        sb.append(", name=").append(name);
        sb.append(", contactInfo=").append(contactInfo);
        sb.append(", borrowedBooks=").append(borrowedBooks);
        sb.append('}');
        return sb.toString();
    }

    
}
