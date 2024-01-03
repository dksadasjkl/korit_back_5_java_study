package com.study.ch03;

public class Function02 {
    // 매개변수x, 리턴x
    public static void fx01(){
        System.out.println("fx01 함수 실행");
        System.out.println();
    }

    // 매개변수o, 리턴x
    public static void fx02(int age, String name){
        System.out.println("fx02 함수 실행");
        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name);
        System.out.println();
    }
    public static void fx02(String name, int age){ // 매개변수 자료형의 갯수와 순서 따라 함수명 재사용 가능,
                                                    // 함수정의가 가능하다 -> 함수의 오버로딩
        System.out.println("fx02 함수 실행");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println();
    }
    public static int fx03() {
        System.out.println("fx03 함수 실행");
        return 100; // 100 == fx03()
    }

//    public static String fx03() {
//        System.out.println("fx03 함수 실행");
//        return "100"; // 100 == fx03()
//    }

    public static String fx04(String name, int age){
        return name + ", " + age; // 문자열 + 정수는 문자열로 반환
    }


    public static void main(String[] args) {
        fx01();
        fx02(27, "서창현");
        fx02("서창현", 26);
        int num = fx03();
        System.out.println(fx03());

        System.out.println();
        String result = fx04("서창현", 26);
        System.out.println(result);


    }
}
