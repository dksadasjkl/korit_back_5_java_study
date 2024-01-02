package com.study.ch02;

public class StudentTypeMain {
    public static void main(String[] args) {
        /*
        이름, 학년, 주소를 저장할 수 있는 StudentType  클래스를 만드시오.
         */

        StudentType studentType = new StudentType();
        studentType.name = "서창현";
        studentType.studentYear = 4;
        studentType.address = "부산 남구";

        System.out.println("이름 : " + studentType.name);
        System.out.println("학년 : " + studentType.studentYear + "학년");
        System.out.println("주소 : " + studentType.address);

        Person p = studentType;
        StudentType studentType2 = (StudentType) p; // 업캐스팅 후 다운캐스팅 가능 메모리 할당되기 때문에

//        Person 전주환 = new Person();
//        StudentType 전주환학생 = (StudentType) 전주환;

        StudentType 전주환학생 = new StudentType(); // 생성 후 StudentType 메모리 할당
        Person 전주환사람 = 전주환학생;
        StudentType 전주환학생2 = (StudentType) 전주환사람;

    }
}
