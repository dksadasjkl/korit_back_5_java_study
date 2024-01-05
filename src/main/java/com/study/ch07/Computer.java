package com.study.ch07;

public class Computer { //클래스 안에 정의된 함수 -> 자바에서는 class 내부이기 때문에 무조건 메소드이다.
    String cpu;
    String ram;
    String disk;
    String type;
    
    // 기본 생성자 -> 생략 가능
    // 1. 클래스의 이름과 동일하다.
    // 2. 메소드의 형태이다.
    // 3. 주소를 리턴하기 때문에 리턴자료형이 없음 -> void, int 등
    Computer () {
        type = "컴퓨터";
    }

    Computer (String type) {
        this.type = type; // 지역변수에서 필드로 옮김, this -> 주소를 의미 -> 객체생성이 해당 주소에서 실행하는것
        // type = type; -> 지역변수 우선이라 실행안됨.
        // super 부모를 의미
    }


    void showInfo() { // this가 생략
        System.out.println("type : " + type);
        System.out.println("cpu : " + cpu);
        System.out.println("ram : " + ram);
        System.out.println("disk : " + disk);
    }
}
