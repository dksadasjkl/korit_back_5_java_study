package com.study.ch05;

public class If01 {
    public static void main(String[] args) {
        // 조건문

        System.out.println(); // 연산의 결과가 아님. 함수 호출

        int i = 4;

        if (i > 3) {
            System.out.println("i가 3보다 큽니다");
            System.out.println("if문 종료");
        } else if (i == 3) {
            System.out.println("i가 3입니다.");
        } else {
            System.out.println("i가 3보다 크지 않습니다.");
        }


        String tempStr = i > 3 ? print("i가 3보가 큽니다") : "";
    }

    public static String print(String str){
        System.out.println(str);
        return str;
    }
}
