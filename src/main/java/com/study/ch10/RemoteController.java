package com.study.ch10;

public class RemoteController extends ElectronicDevice {
    // 추상 클래스로 만들어서 추상 메소드를 상속받게 가능할 수 있다.
    @Override
    void showDeviceState() {
        System.out.println("리모컨의 상태를 확인합니다.");
    }
}
