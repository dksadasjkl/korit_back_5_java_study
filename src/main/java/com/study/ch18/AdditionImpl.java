package com.study.ch18;

public class AdditionImpl implements Addition{
    
    // 매개변수명은 달라도 된다. 자료형의 형태과 순서, 객수가 중요
    @Override
    public int add(int x, int y) {
        System.out.println("AdditionImpl에서 호출한 add 메서드");
        return x + y;
    }
}
