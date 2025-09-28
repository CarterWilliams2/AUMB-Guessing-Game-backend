package com.example.aumble_backend;

import com.example.aumble_backend.model.Member;
import com.example.aumble_backend.repository.MemberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestDatabase implements CommandLineRunner {

    private final MemberRepository memberRepository;

    public TestDatabase(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Member m = new Member("cjw0113", "Carter Williams", "Mellophone", 4, "Section Leader");
        memberRepository.save(m);


        memberRepository.findAll().forEach(member -> System.out.println(member.getName()));
    }
}