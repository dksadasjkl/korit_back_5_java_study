package com.study.ch02;

public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person(); // 객체 생성
        p.name = "서창현"; // 주소 참조 - 값 넣기
        p.age = 30;

        Person p2 = new Person();
        p2.name = "창현서";
        p2.age = 31;


    }
}
