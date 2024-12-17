package com.libraryms.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryms.library.dal.IMemberDAO;
import com.libraryms.library.model.Member;

@Service
public class MemberService {
  
    @Autowired
    private IMemberDAO memberDAO;

    public List<Member> getAllMembers(){
        return memberDAO.getAllMembers();
    }

    public Member getMemberById(String memberId){
        return memberDAO.getMemberById(memberId);
    }

    public void addMember(Member member){
        memberDAO.addMember(member);
    }

    public void updateMember(Member member){
        memberDAO.updateMember(member);
    }

    public void deletemember(String memberId){
        memberDAO.deletemember(memberId);
    }

}
