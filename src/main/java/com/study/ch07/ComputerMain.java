package com.study.ch07;

public class ComputerMain {
    public static void main(String[] args) {
        // 정적 메모리 -> 정해진 메모리
        // 동적 메모리 -> new - 늘리고 줄이는 메모리
        Computer computer1 = new Computer(); // 객체 생성 -> 틀 찍기 -> 생성자 호출
        Computer computer2 = new Computer("노트북"); // 객체 생성 -> 틀 찍기 -> 문자열 매개변수에 값을 주입하여
                                                        // 생성자 호출
        System.out.println(computer1); // 100번 주소
        System.out.println(computer2); // 200번 주소

        computer1.cpu = "i5"; // 주소참조 대입
        computer2.cpu = "i7"; //

        System.out.println(computer1.cpu);
        System.out.println(computer2.cpu);
        
        System.out.println();
        computer1.showInfo();
        System.out.println();
        computer2.showInfo();

        computer1.ram = "8GB";
        computer2.ram = "16GB";

        System.out.println("----------------");
        computer1.showInfo();
        System.out.println();
        computer2.showInfo();
        
        computer1.type = "데스크탑"; // computer1.변수명 -> 100 주소에 대입

    }
}
