package com.study.ch15;

public class SendMain {
    public static void main(String[] args) {
        // 일반 자료형 x
        // <> 생성 시 SandData<T>의 T 부분이 String으로 대입
        // String틀

        SendData<String> sendData1 = new SendData(200, "서창현");
//        send(sandData1);
        // <생략가능> -> 앞에서 정의
        // 뒤에 생략시 <> 오브젝트타입으로 들어감
        // Member
        SendData<Member> sendData2 = new SendData<>(200, new Member("서창현", "01010101"));
        send(sendData2);
        SendData<VipMember> sendData3 = new SendData(200, new VipMember("현창서", "11111111"));
        send(sendData3);
    }
    
    // 제네릭의 와일드카드 <?> -> 모든 자료형을 받음
    // SendData<?> 리턴타입도 가능
    // SendData<? extends Member> 부모와 연결된 모든 자식
    // super VipMember 는 나와 부모 가능 -> 누나 동생은 불가닝
    public static void send(SendData<? super VipMember> sendData) {
        sendData.send();
    }
}
