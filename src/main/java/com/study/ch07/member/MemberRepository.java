package com.study.ch07.member;

public class MemberRepository {

    int insert(Member member) {
        System.out.println("저장소에 Member 저장");
        System.out.println(member.toString());
        return 1;
    }
}
