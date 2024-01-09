package com.study.ch13;

/*
Company 클래스를 싱글톤을 적용하여 구현하시오.
 */

public class Company {
    // 싱글톤 -> 1개만 사용할때 -> 메모리할당을 못해서 생성을 못할때 사용
    
    // 1. 암호화 + 정적메모리
    private static Company instance;
    private String name;

    // 2. 생성자 암호화
    private Company() {}
    
    // instance이 null이면 새 주소 생성 -> 생성되어 있으면 기존 인스턴스 리턴
    public static Company getInstance() {
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
