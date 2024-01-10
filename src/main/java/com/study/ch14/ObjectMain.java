package com.study.ch14;

public class ObjectMain {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("서창현", "중구");

        System.out.println(objectTest.toString());
        System.out.println(objectTest);

        ObjectTest objectTest1 = new ObjectTest("서창현", "중구");

        System.out.println(objectTest.equals(objectTest1)); // 값비교
        System.out.println(objectTest == objectTest1); // 주소비교

        System.out.println(objectTest.getClass());
        System.out.println(objectTest1.getClass());
        System.out.println(ObjectTest.class);

        // hashCode() 값만 비교 -> 주소값이 같아도 값만 비교
        // 문자를 유니코드 10진수 -> 16진수로
        System.out.println(objectTest.hashCode()); // 실제 메모리 주소 -> 16진수(toHexString) 문자열로 return받음.
        System.out.println(objectTest1.hashCode());
    }
}
