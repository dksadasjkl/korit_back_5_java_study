package com.study.ch08;

public class PhoneArrayMain {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3]; // 집에 방이 3개임.
        phones[0] = new Phone("삼성", "갤럭시"); // 클래스는 생성을 해야함
        phones[1] = new Phone("애플", "아이폰");
        phones[2] = new Phone("샤오미", "miPhone");


        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].toString());
        }
    }
}
