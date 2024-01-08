package com.study.ch08.car;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null; // 메서드 내에서는 자동 초기화 x
        boolean loopFlag = true;
        
        Car[] cars = new Car[3];
        CarRepository carRepository = new CarRepository(cars); // cars의 주소를 대입
        CarService carService = new CarService(carRepository);

//        CarService carService1 = new CarService(new CarRepository(new Car[3])); - 한줄로 사용할수있지만 안씀
//        carService.carRepository = carRepository; // -> carService에 carRepository 클래스 변수에 carRepository 결합
//        carRepository.cars = cars; // carRepository의 cars 배열에 main cars


        while (loopFlag) {
            System.out.println("자동차 관리 프로그램");
            System.out.println("1. 자동차 등록");
            System.out.println("2. 자동차 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >>>");
            selectedMenu = scanner.nextLine();
            if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램을 종료중......");
                loopFlag = false;
            } else if ("1".equals(selectedMenu)) {
                System.out.println("<<<< 자동차 등록 페이지 >>>>");

                String model = null;
                String color = null;
                
                if (carService.isFull()) {
                    System.out.println("더이상 등록할 수 없습니다.");
                    continue; //함수 x
                }
                
                // view로 빼야함
                System.out.print("모델명 >>> ");
                model = scanner.nextLine();
                System.out.print("색상 >>> ");
                color = scanner.nextLine();

                Car car = new Car(model, color); // entity
                carService.append(car);


            } else if ("2".equals(selectedMenu)) {
                System.out.println("<<<< 자동차 조회 페이지 >>>>");
               carService.PrintCarList();
            } else {
                System.out.println("다시 입력하세요"); // 무한루프 돌려라
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}
