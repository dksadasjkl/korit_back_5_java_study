package com.study.ch06;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        // 증감없이 사용가능 i++
        while (flag) { //이터럴 상수
            System.out.print("입력 : ");
            int inputValue = scanner.nextInt();

            System.out.println("입력한 번호: " + inputValue);
            if (inputValue == 0) {
                System.out.println("프로그램을 종료합니다.");
                flag = false;
            } else if (inputValue == 1) {
                System.out.println("1번으로 들어왔습니다.");
                boolean flag2 = true;
                while (flag2) {
                    System.out.print("1번에서 입력 : ");
                    inputValue = scanner.nextInt();
                    System.out.println("입력한 번호: " + inputValue);
                    if (inputValue == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        flag = false; // 중첩 while문 종료
                        flag2 = false;
                    } else if (inputValue == -1) {
                        System.out.println("뒤로가기");
                        flag2 = false;
                    } else if (inputValue == 1) {
                        System.out.println("1번에서 1번으로 들어왔습니다.");
                    } else if (inputValue == 2) {
                        System.out.println("1번에서 2번으로 들어왔습니다.");
                    } else {
                        System.out.println("다시 입력하세요.");
                    }
                    System.out.println();
                }

                System.out.println("1번으로 들어왔습니다.");
            } else if (inputValue == 2) {
                System.out.println("2번으로 들어왔습니다.");
            } else {
                System.out.println("다시 입력하세요.");
            }
            System.out.println();
        }
    }
}
