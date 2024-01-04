package com.study.ch06;

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("별 몇개? : ");
        int starCount = scanner.nextInt();  
        
        // 1번
        for (int i = 0; i < starCount ; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // 2번
        System.out.println();
        for (int i = 0; i < starCount; i++) {
            for (int j = starCount; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < starCount; i++) {
            for (int j = starCount; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println();
        for (int i = 0; i < starCount; i++) {
            for (int j = starCount; j > i; j--) {
                System.out.print("*");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(" ");
            }
            System.out.println();

        }

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


    }
}
