package com.study.ch15;

import lombok.AllArgsConstructor;

@AllArgsConstructor
//<> -> 타입을 지정 받을 수 있다 
// 일반 자료형은 사용불가, 클래스 자료형만 가능
// T 자료형(Integer, String), R 리턴타입, E 요소(멤버)
public class SendData<T> {
    private int code;
    public  T data;

    public void send() {
        System.out.println("[ 데이터 전송 ]");
        System.out.println("code : " + code);
        System.out.println("data : " + data);
    }
}

