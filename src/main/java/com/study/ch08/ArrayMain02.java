package com.study.ch08;

import java.util.Scanner;

public class ArrayMain02 {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "서창현";
        names[1] = "서현";
        names[2] = "서창";
        names[3] = "서";
        names[4] = "창";


        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        System.out.println();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
