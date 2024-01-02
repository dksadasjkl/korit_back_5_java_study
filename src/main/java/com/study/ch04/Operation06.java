package com.study.ch04;

public class Operation06 {
    public static void main(String[] args) {
       /*
       < 문제 >

        조건연산자(삼항연산자) - 연산자 안에서 연산자 사용가능
        a > 0 ? "양수"
        : a == 0 ? "0"
        : "음수"
        */

        int iResult = 10 > 2 ? 1111 : 2222; // 결과값이 자료형과 일치
        String sResult = 10 > 2 ? "1111" + 1 : "2222";
        boolean bResult = !(10 > 2);
        System.out.println(iResult);
        System.out.println(sResult);
        System.out.println(bResult);

        System.out.println("테스트 코드 작성");
    }
}
