package com.study.ch19;

public class BuilderMain {
    public static void main(String[] args) {
        // 객체생성 -> 클래스.스태틱 메소드
        // CarBuilder() 생성자
        // 순서 x
        Car.CarBuilder carBuilder = Car.builder();
        Car car2 = carBuilder.build();

        Car car = Car.builder().model("아반테").color("블루").build(); // new Car("아반테","블루");
        System.out.println(car);

        Member member = Member.builder()
                .phone("3213213213213123213213213213132")
                .name("서창현")
                .build();
        System.out.println(member);


    }
}
