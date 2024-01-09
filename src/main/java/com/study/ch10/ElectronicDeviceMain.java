package com.study.ch10;

public class ElectronicDeviceMain {
    public static void main(String[] args) {
        // 추상 클래스는 생성 x -> 상속을 통해 생성
        // 익명클래스
        ElectronicDevice electronicDevice = new ElectronicDevice() {
            @Override
            void showDeviceState() {
                System.out.println("첫번째 기기 상태확인");
            }
        }; // 일회용(1번) 클래스 영역 -> 상속받고 새로운 클래스를 만들어 추상메소드를 재정의해서 생성
        ElectronicDevice electronicDevice2 = new ElectronicDevice() {
            @Override
            void showDeviceState() {
                System.out.println("두번째 기기 상태확인");
            }
        };
        RemoteController remoteController = new RemoteController();

        ElectronicDevice[] electronicDevices = new ElectronicDevice[3];
        electronicDevices[0] = electronicDevice;
        electronicDevices[1] = electronicDevice2;
        electronicDevices[2] = remoteController;

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }
        // 스태틱 상수
        System.out.println(Power.ERROR_CODE);
    }
}
