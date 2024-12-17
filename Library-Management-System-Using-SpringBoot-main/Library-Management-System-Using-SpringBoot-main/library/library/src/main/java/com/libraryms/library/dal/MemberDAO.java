package com.libraryms.library.dal;

import com.libraryms.library.model.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MemberDAO implements IMemberDAO {

    private final Map<String, Member> memberRecords = Collections.synchronizedMap(new HashMap<>());

    @Override
    public void addMember(Member member) {
        memberRecords.put(member.getMemberId(), member);
    }

    @Override
    public List<Member> getAllMembers() {
        return new ArrayList<>(memberRecords.values());
    }

    @Override
    public Member getMemberById(String memberId) {
        return memberRecords.get(memberId);
    }

    @Override
    public void updateMember(Member member) {
        memberRecords.put(member.getMemberId(), member);
    }

    @Override
    public void deletemember(String memberId) {
        memberRecords.remove(memberId);
    }
}
