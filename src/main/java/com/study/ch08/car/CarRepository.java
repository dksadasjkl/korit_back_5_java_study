package com.study.ch08.car;

public class CarRepository {
    // DB 연결
    final Car[] cars; // 주소
    // 상수는 필수 초기화

    CarRepository(Car[] cars) {
        this.cars = cars;
    }

    int getEmptyIndex() {
        for (int i = 0; i < cars.length; i++) {
            if(cars[i] == null) {
                return i;
            }
        }
        return -1; // 꽉참
    }

    void  insert(Car car) {

        cars[getEmptyIndex()] = car;
    }

    Car[]  getCarDatas () {
        int carCount = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                carCount++;
            }
        }


        Car[] newCars = new Car[carCount];
        int j = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                newCars[j] = cars[i];
                j++;
            }
        }
        return newCars;
    }
}
