package com.study.ch07;

public class UserMain01 {
    public static void main(String[] args) {
        User01 user1 = new User01("aaa", "1234");
        User01 user2 = new User01("bbb", "1234", "김준이", "skjil12@gmail.com");

        user1.showInfo();
        System.out.println();

        user2.showInfo();
        System.out.println();

        user1.setName("서창현");
        user1.setEmail("ckdgus1231@naver.com");

        user1.showInfo();
    }
}
