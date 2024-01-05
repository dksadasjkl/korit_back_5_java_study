package com.study.ch08.member;

import java.util.Scanner;

public class MemberService {

    String inputValue (String label) {
        Scanner scanner = new Scanner(System.in);
        String value = null;
        while (true) { // value가 트루?
            System.out.print(label +  "(입력취소: exit) >>> ");
            value = scanner.nextLine();
            if (!value.isBlank()){
                break;
            }
        }
        return  value;
    }

    boolean addMember(Member[] members) {
        String code = null;
        String name = null;
        String age = null;
        String address = null;


        System.out.println("<<< 회원 등록 >>>");
        code = inputValue("회원코드");
        if ("exit".equalsIgnoreCase(code)) {
            return false;
        }
        name = inputValue("이름");
        if ("exit".equalsIgnoreCase(name)) {
            return false;
        }
        age = inputValue("나이");
        if ("exit".equalsIgnoreCase(age)) {
            return false;
        }
        address = inputValue("주소");
        if ("exit".equalsIgnoreCase(address)) {
            return false;
        }

        Member member = new Member(code, name,Integer.parseInt(age), address);
        //Member(code, name,Integer.parseInt(age), address) -> member 변수의 주소에 담음.
        MemberRepository memberRepository = new MemberRepository();


        return memberRepository.insert(members, member) > 0; // true or false
    }
}
