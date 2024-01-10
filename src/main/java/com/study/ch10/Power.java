package com.study.ch10;

public interface Power {
    String ERROR_CODE = "-9999";


    /*
    인터페이스 : 메소드 기본값은 추상메소드이다, 멤버변수 선언 x, 선언은 상수만 가능, 다중상속 가능(, 추가), 부품화가능
    스태틱 상수만 가능
    추상클래스 : 기본값은 일반메소드이다, 멤버변수 선언 o, 다중상속 x -> 1ㄷ1만 가능
    */
    void  setPowerOn();
    void  setPowerOff();
    
    // 일반 메소드 정의 default
    default  void  test() {
        
    }
}
