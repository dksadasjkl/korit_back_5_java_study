package com.study.ch07;

public class Student01 {
    String name;
    int age;
//    String address;
    final String address;

    // 생성자 constructor
    // args (arguments) 매개변수 값

    // NoArgsConstructor -> 기본 생성자 -> 기본으로 생략되어 있으며,
    // AllArgsConstructor 등 생성자가 정의된게 없을 떄 제공됨. 있으면 사용불가 정의해서 사용해야함.
    // final 상수는 -> 무조건 초기화되어함.
    Student01 () {
        address = "";
    }

    // RequiredArgsConstructor - final, notnull 등 최초의 초기화가 되어야하는것만
    Student01(String address){
        this.address = address;
    }

    // AllArgsConstructor -> 전체 생성자
    Student01 (String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

}
