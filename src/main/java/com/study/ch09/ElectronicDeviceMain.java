package com.study.ch09;

public class ElectronicDeviceMain {
    public static void main(String[] args) {
        ElectronicDevice[] electronicDevices = new ElectronicDevice[10];
        // 짝수면 컴터/홀수면 스맛폰 -> 업캐스팅
        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i] = i % 2 == 0 ? new Computer() : new SmartPhone();
        }
        // ******메소드의 재정의 우선****** -> 
        // 재정의 - > 부모의 메소드와 동일한 메소드 형태로 실행문을 다시 정의할 수 있음.
        // 업캐스팅 했을때 -> 자식에서 부모로 업캐스팅 했을때 재정의된 메소드의 실행문을 실행,
        // -> 자식에 정의된 메소드와 변수는 사용불가

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }

        System.out.println();
        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].setPowerOn();
        }

        System.out.println();
        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }

        System.out.println();
        // 인스턴스 -> 객체
        // instanceof 객체의 원본이 맞다면 true
        // 다운캐스팅은 원본이 있어야함.
        for (int i = 0; i < electronicDevices.length; i++) {
            if (electronicDevices[i] instanceof Computer) {
                Computer computer = (Computer) electronicDevices[i];
                computer.playGame();
            } else if (electronicDevices[i] instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) electronicDevices[i];
                smartPhone.call();
            }
        }
    }
}