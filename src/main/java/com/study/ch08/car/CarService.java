package com.study.ch08.car;

public class CarService {
    CarRepository carRepository; // 클래스의 멤버변수 -> 자동 초기화


     CarService (CarRepository carRepository){
        this.carRepository = carRepository;
    }



    boolean isFull() {
        return carRepository.getEmptyIndex() == -1;
    }

    void append(Car car) {
        carRepository.insert(car);
    }

    void PrintCarList() {
         Car[] cars = carRepository.getCarDates();
         if (cars.length == 0) {
             System.out.println("등록된 차량이 없습니다.");
             return;
         }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }
}
