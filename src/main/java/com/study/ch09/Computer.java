package com.study.ch09;

public class Computer extends ElectronicDevice {
    String cpu;
    int ram;

    void  playGame() {
        System.out.println("PC 게임을 합니다.");
    }

    void showDeviceState(){
        System.out.print("컴퓨터");
        super.showDeviceState(); // 부모 주소에서 메소드 호출
    }
}
