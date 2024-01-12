package com.study.ch19;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
// ***** 시험


public class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // static 해당 클래스를 생성해야지만 접근 -> static끼리는 생성없이 접근가능
    public static CarBuilder builder() {
        return new CarBuilder();
//        CarBuilder builder() = new CarBuilder(); 100번 주소

    }

    // 내부 클래스
    public static class CarBuilder {
        private String model;
        private String color;


        public CarBuilder model(String model) {
            this.model = model;
            return this; //자기 주소를 리턴해서 다시 호출가능 100리턴
        }


        public CarBuilder color(String color) { //100번
            this.color = color;
            return this;
        }


        public Car build() {
            return new Car(model, color);
//            Car build() = new Car(model, color); 200번주소

        }
    }
}
