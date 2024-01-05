package com.study.ch06;

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("별 몇개? : ");
        int starCount = scanner.nextInt();  
        
        // 1번 5 - > 0 1 2 3 4
        for (int i = 0; i < starCount; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
//        // 2번 - 내가푼거
//        System.out.println();
//        for (int i = 0; i < starCount; i++) {
//            for (int j = starCount; j > i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 2번
        for (int i = 0; i < starCount; i++) {
            for (int j = 0; j < starCount - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


//        // 3번 내가 푼거
//        System.out.println();
//        for (int i = 0; i < starCount; i++) {
//            for (int j = starCount; j > i + 1; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i + 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 3번 - 내가 푼거 - 수정본
        for (int i = 0; i < starCount; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
//        // 4번 - 내가푼거
//        System.out.println();
//        for (int i = 0; i < starCount; i++) {
//            for (int j = starCount; j > i; j--) {
//                System.out.print("*");
//            }
//            for (int k = 0; k < i + 1; k++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        // 4번
        for (int i = 0; i < starCount; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < starCount - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // 5번 내가푼거
        System.out.println();
        for (int i = 0; i < starCount; i++) {
            for (int j = starCount; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //5번
        for (int i = 0; i < starCount; i++) {
            for (int j = 0; j < starCount - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i + 1) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //3번


        /*
        1번
        *
        **
        ***

         */

        /*
        2번
        *****
        ****
        ***
        **
        *
         */

        /*
        3번
          *
         **
        ***
         */

        /*
        4번
        ***
         **
         *
         */

        /*
        5번
          *
         ***
        *****
         */

        /*
         *  = " " 4개, 별 1개
         **  = " " 3개, 별 2개
         ***  = " " 2개, 별 3개
         **** = " " 1개, 별 4개
         ***** = " " 0개, 별 5개

         */


    }
}
