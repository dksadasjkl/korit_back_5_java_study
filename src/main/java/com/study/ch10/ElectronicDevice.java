package com.study.ch10;

public abstract class ElectronicDevice {

    /*
    [ 추상화 ]
    1. 추상 클래스 abstract class
    2. 인터페이스 interface
     */

    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }

    void setPowerOff() {
        powerState = false;
    }

    // 추상 메소드 -> 실행문(중괄호 생략) -> ;
    // -> 추상 클래스에서만 가능
    // -> 상속받고 메소드를 완성해야 가능
    abstract void showDeviceState();
}
