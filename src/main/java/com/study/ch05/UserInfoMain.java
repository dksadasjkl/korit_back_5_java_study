package com.study.ch05;

import java.util.Scanner;

public class UserInfoMain {
    public static void main(String[] args) {
        /*
        이름 : 서창현
        나이 : 27
        연락처 : 01048744131 - 0은 숫자가 아님
        학년 : 4
        주소 : 부산 동래구
         */

        Scanner scanner = new Scanner(System.in);
        String name = null;
        int age = 0;
        String phone = null;
        int grade = 0;
        String address = null;

        System.out.print("이름을 입력하세요 : ");
        name = scanner.next();

        System.out.print("나이을 입력하세요 : ");
        age = scanner.nextInt();

        System.out.print("연락처를 입력하세요 : ");
        phone = scanner.next();

        System.out.print("학년을 입력하세요 : ");
        grade = scanner.nextInt();

        System.out.print("주소를 입력하세요 : ");
        scanner.nextLine();
        address = scanner.nextLine();


        System.out.println();
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("연락처 : " + phone);
        System.out.println("학년 : " + grade);
        System.out.println("주소 : " + address);

    }
}
