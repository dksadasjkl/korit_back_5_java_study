package com.study.ch11;

public class Phone {
    static  int autoCount = 0; // 카피 x -> 정적메모리 (메모리할당)
    int serialNumber;
    Company company;

    public Phone(Company company) {
        autoCount++; // 생성할때 마다 증감
        this.serialNumber = 20242000;
        this.serialNumber += autoCount;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "serialNumber=" + serialNumber +
                ", company=" + company.toString() +
                '}';
    }
}
