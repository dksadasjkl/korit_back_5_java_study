package com.study.ch05;

public class If02 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        if (x > 0 && y > 0) {
            System.out.println("1사분면");
        } else if (x < 0 && y > 0) {
            System.out.println("2사분면");
        } else if (x < 0 && y < 0) {
            System.out.println("3사분면");
        } else if (x > 0 && y < 0) {
            System.out.println("4사분면");
        } else {
            System.out.println("오류");
        }

    }

}
