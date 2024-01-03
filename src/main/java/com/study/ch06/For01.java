package com.study.ch06;

import com.study.ch02.Person;

public class For01 {
    public static void main(String[] args) {
        // for문 반복횟수를 일정하게 증가될 때
        for (int i = 0; i < 10; i++) {
            System.out.println("i : " +  (i + 1));
        }

        // while문 조건이 중심일 때
        int i = 0;
        while (i < 10) {
            System.out.println("i : " + i);
            i++;
        }

    }
}
