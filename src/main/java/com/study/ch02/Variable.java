package com.study.ch02;

public class Variable {
    public static void main(String[] args) {
        int date = 20231230;
        // 리터널 상수 = 정해진 값
        /*
        int 라는 공간에 4byte 값을 할당
        date 라는 변수의 주소값을 할당
        변수는 저장된 메모리의 값을 가져옴
         */

        double date2 = date;
        int date3 = (int) date2;

        // 문자 -> 정수 -> 실수 - 업캐스팅 (묵시적 형변환)
        char a = '1';
        int b = a;
        double c = b;

        System.out.println(20231229 + 1);
        System.out.println(20231229 + 2);
        System.out.println(20231229 + 3);
        System.out.println(20231229 + 4);
        System.out.println(20231229 + 5);
        System.out.println(20231229 + 6);
        System.out.println(20231229 + 7);
        System.out.println(20231229 + 8);
        System.out.println(20231229 + 9);
    }
}
