package com.study.ch06;

import com.study.ch02.Person;

public class For02 {
    public static void main(String[] args) {
        /*
        0, 1, 2, 3, 4
        */


        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            if(i  % 5 != 4){
                System.out.print(", ");
            }
            if (i % 5 == 4) {
                System.out.println();
            }

        }


        System.out.println();
        // 내가 푼 것
        for (int i = 0; i < 5; i++) {
            System.out.print(i + ", ");
            if(i == 3) {
                System.out.println((i + 1));
                break;
            }
        }
        // 내가 푼 것
        System.out.println();
        for (int i = 0; i < 10; i++) {
           if (i < 4) {
               System.out.print(i + ", ");
           } else if (i == 4){
                System.out.print(i);
               System.out.println();
           } else if (i > 4 && i < 9){
               System.out.print(i + ", ");
            }else if (i == 9){
                System.out.print(i);
            } else {
                System.out.println("결과 값이 없습니다");
            }
        }

        System.out.println();
        System.out.println();
        int n = 10;
        for (int i = 0; i < n; i++) {
            int num = n - 1 - i;
            System.out.print(num);
            if (num % 5 != 0) {
                System.out.print(", ");
            }
            if (num % 5 == 0) {
                System.out.println();
            }
        
        }


    }
}
