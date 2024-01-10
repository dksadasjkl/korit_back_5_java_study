package com.study.ch14;

import java.util.Objects;
/*
Object 클래스
모든 클래스는 Object 클래스를 상속받는다. -> extends Object가 생략된것. -> Object만 다중상속 가능
 */

public class ObjectTest {

    private String name;
    private String address;

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 여기 주소와 받은 주소를 같으면 true -> 무조건 같음
        if (o == null || getClass() != o.getClass()) return false; // 주소가 null or 주소가 같지않으면 -> this.getClass()
        ObjectTest that = (ObjectTest) o; // 다운캐스팅
        return Objects.equals(name, that.name) && Objects.equals(address, that.address); //Object[s] -> 도구역할
        // Objects. 스태틱이라 생성없이 사용가능
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public String toString() {
        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';




    }
}
