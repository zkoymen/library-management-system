package com.library.library_management_system.member;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/members")
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // GET http://localhost:8080/api/v1/members
    @GetMapping
    public List<Member> getMembers() {
        return memberService.getAllMembers();
    }


    // GET http://localhost:8080/api/v1/members/1
    @GetMapping(path = "{memberId}")
    public Member getMemberById(@PathVariable("memberId") Long memberId) {
        return memberService.getMemberById(memberId);
    }


    // POST http://localhost:8080/api/v1/members
    @PostMapping
    public Member registerNewMember(@RequestBody Member member) {
        return memberService.registerNewMember(member);
    }

    // DELETE http://localhost:8080/api/v1/members/1
    @DeleteMapping(path = "{memberId}")
    public void deleteMember(@PathVariable("memberId") Long memberId) {
        memberService.deleteMember(memberId);
    }
}