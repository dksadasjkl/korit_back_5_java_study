package com.study.ch05;

import java.util.Scanner; // import 외부

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // next() 기본 String 자료형으로 가져옴.
        System.out.print("a : ");
        int a = scanner.nextInt(); // int 자료형
        System.out.print("b : ");
        int b = scanner.nextInt();
        System.out.print("c : ");
        int c = scanner.nextInt(); // 버퍼 Enter


        System.out.print("타이틀 : ");
        scanner.nextLine();
        String title = scanner.nextLine(); // 개행문자(스페이스, 엔터)를 먹음.

        System.out.println(title + " : " + (a + b + c));

    }
}
