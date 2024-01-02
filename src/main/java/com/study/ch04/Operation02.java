package com.study.ch04;

public class Operation02 {
    public static void main(String[] args) {
        /*
        << 연산자 >>
        산술연산자, 비교연산자, 논리연산자, 조건연산자, 복합대입연산자
         */

        System.out.println(true);
        System.out.println(false);

        boolean flag = 10 > 2;
        System.out.println();

        System.out.println("비교연산자");
        System.out.println(" > " + flag);
        System.out.println(" < " + (10 < 2));
        System.out.println(" >= " + (10 >= 10));
        System.out.println(" <= " + (10 <= 2));
        System.out.println(" == " + (10 == 2)); // 같을 때
        System.out.println(" != " + (10 != 2)); // not

    }
}
