package com.study.ch19;

public class StudentMain {
    public static void main(String[] args) {
        Student student = Student.Builder()
                .name("서창현")
                .address("부산 진구")
                .age(19)
                .build();

        System.out.println(student);
    }
}
