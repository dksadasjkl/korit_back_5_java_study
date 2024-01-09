package com.study.ch13;

public class Car {
    private String serialNumber;
    private String name;

    public Car(String serialNumber, String name) {
        this.serialNumber = serialNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "serialNumber='" + serialNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
