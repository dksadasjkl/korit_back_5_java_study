package com.study.ch13;

import java.util.Scanner;

public class FactoryService2 {
    private Scanner scanner;
    private Factory factory;

    public FactoryService2(Scanner scanner, Factory factory) {
        this.scanner = scanner;
        this.factory = factory;
    }

    public void create() {
        System.out.println("2공장에서 차량을 생산합니다.");
        System.out.print("모델명 입력 >> ");
        String modelName = scanner.nextLine();

        Factory factory1 = Factory.getInstance(); // 메소드는 public이라 가능
        factory.setFactoryName("자동차 생산 공장");
        Car car = factory.produce(modelName);
        System.out.println(car.toString());
    }
}
