package com.study.ch13;

public class Factory {
    //[시험] *********** 싱글톤 특징 **********
    // 자기 자신 클래스를 스태틱 변수(변수명 : instance)로 가지고 있어야한다.
    // 클래스명.getInstance()
    private static Factory instance; // 기본값 null
    private  String factoryName;
    private  int autoCount;
    private final int DEFAULT_NUMBER = 2024000;
    
    // 싱글톤 특징
    // -> 생성자 private으로 외부 생성을 막아준다.
    private Factory() {

    }
    
    // 싱글톤 기본 형태
    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance; // 주소리턴
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    // 1번방법 : Integer.toString() -> 문자열로 변환
    // 2번방법 : new Car("" + (DEFAULT_NUMBER + autoCount), model);
    public Car produce(String model) {
        autoCount++;
        return new Car(Integer.toString(DEFAULT_NUMBER + autoCount), model);
    }

    @Override
    public String toString() {
        return "Factory{" +
                "factoryName='" + factoryName + '\'' +
                ", autoCount=" + autoCount +
                ", DEFAULT_NUMBER=" + DEFAULT_NUMBER +
                '}';
    }
}
