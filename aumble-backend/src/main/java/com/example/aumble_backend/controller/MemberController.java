package com.example.aumble_backend.controller;

import com.example.aumble_backend.model.Member;
import com.example.aumble_backend.repository.MemberRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class MemberController {

    private final MemberRepository memberRepository;
    private final Random random = new Random();

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/random-member") 
    public Member getRandomMember() {
        List<Member> allMembers = memberRepository.findAll();
        if (allMembers.isEmpty()) {
            return null;
        }
        return allMembers.get(random.nextInt(allMembers.size()));
    }
}