package com.study.ch05;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = null;

        System.out.print("번호 선택 : ");
        num = scanner.next();
        
        // 해당 case부터 전부 출력, 자료형 동일
        switch (num) {
            case "0":
                System.out.println("0선택");
                break;
            case "1":
                System.out.println("1선택");
                break;
            case "2":
                System.out.println("2선택");
                break;
            default:
                System.out.println("오류");
        } 
    }
}
