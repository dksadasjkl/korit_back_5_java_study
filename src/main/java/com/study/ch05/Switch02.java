package com.study.ch05;

import java.util.Scanner;

public class Switch02 {
    public static boolean select() { // 함수 안에서 변수명을 재사용가능 -> 지역함수
                                    // -> 메모리할당 이후 폐기하기 때문 -> 즉 중괄호의 시작과 끝지점에서만 가능
                                    // 밖에서는 변수명을 한번만 가능 -> 전역함수
        Scanner scanner = new Scanner(System.in);
        System.out.print("여기서 멈출까요?(y/n)? ");
        String value = scanner.next();
        return"y".equals(value) || "Y".equals(value);
    }

    public static void main(String[] args) {
        int num = 1;

        System.out.println("게임 시작");
        switch (num) {
            case 1:
                System.out.println("1단계 시작");
                if(select()){
                    break; // 명령문이라 리턴이 안됨.
                }
            case 2:
                System.out.println("2단계 시작");
                if(select()){
                    break;
                }
            case 3:
                System.out.println("3단계 시작");
                if(select()){
                    break;
                }
            case 4:
                System.out.println("4단계 시작");
                if(select()){
                    break;
                }
            case 5:
                System.out.println("마지막단계 시작");

        }
    }
}
