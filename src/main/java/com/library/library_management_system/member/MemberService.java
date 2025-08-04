package com.library.library_management_system.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public Member registerNewMember(Member member) {
        // Check if the email is already taken
        Optional<Member> memberOptional = memberRepository.findByEmail(member.getEmail());
        if (memberOptional.isPresent()) {
            throw new IllegalStateException("Email already taken");
        }
        return memberRepository.save(member);
    }

    public void deleteMember(Long memberId) {
        boolean exists = memberRepository.existsById(memberId);
        if (!exists) {
            throw new IllegalStateException("Member with id " + memberId + " does not exist");
        }
        // We might want to add a check here later: "can't delete member if they have books on loan"
        memberRepository.deleteById(memberId);
    }
}