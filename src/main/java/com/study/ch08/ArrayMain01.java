package com.study.ch08;

import com.study.ch02.Person;

import java.util.Scanner;

public class ArrayMain01 {
    public static void main(String[] args) {
        // 생성 -> 메모리 할당 -> 힙 메모리 -> 동적 메모리 할당 -> 끄지않고 빌려쓰고
        // -> 자바에서는 가비지 컬렉션으로 자동 메모리수거

        // 스택 -> 정적 메모리 할당 -> 프로그램을 다시 켜야함
        
        /*
         배열(Array) -> 사용 이유 순서대로 데이터를 묶어서 사용하기 위해, 크기 조절이 안됨
                       -> 비슷한 변수명이라도 메모리에 순서없이 저장하기 때문
                       -> new int[3] -> [0] - 100 , [1] - 104, [2] - 108 (묶여서 생성)
                       -> 늘리기 위해서는 값을 옮겨야함. for문 -> 주소 대입
         */
        int num1 = 10;
        int num2 = 20;

        int[] numArray; // 선언

        numArray = new int[3]; // 값(주소) 대입
        int[] numArray2 = new int[4];


        System.out.println(numArray);

        System.out.println(numArray[0]);

        numArray[0] = 10;
        System.out.println(numArray[0]);
        numArray[1] = 20;
        numArray[2] = 30;

        Scanner scanner = new Scanner(System.in);
        System.out.print("인덱스 : ");
        int index = scanner.nextInt();

        System.out.println();
        System.out.println(numArray[index]);


    }
}
