package com.study.ch01;

public class PrintStudy {
    public static void main(String[] args) {
        System.out.println("\uAC10");
        System.out.println("\u0061");
        System.out.println('서' + '창' + '현');
        System.out.println("" + '서' + '창' + "현"); // 문자열 우선
        System.out.println("" + 10 + 20);
        System.out.println("나이 : " + (10 + 20));

        // 0000 0010 - 10진수
        // 0000 0007 - 0~7 (8진수)
        // 0000 0000 0 (-128) : (0 127) - c언어
        // 1byte = 8bit

        // char 자료형 -> 2byte


    }
}
