package com.study.ch06;

public class Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("i : " + i);
            if (i % 2 != 0) { //조건이 끝날때까지 - 나머지 값이 '0'이 아니라면 다음 반복을 해라 - > 홀수이면
            continue;           // 0 과 짝수이면 if문을 빠져나와 실행문 다시 반복        
            }
            System.out.println("for문 마지막");
        }
    }
}
