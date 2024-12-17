package com.libraryms.library.dal;

import com.libraryms.library.model.Member;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface IMemberDAO {
    void addMember(Member member);
    List<Member> getAllMembers();
    Member getMemberById(String memberId);
    void updateMember(Member member);
    void deletemember(String memberId);
}
