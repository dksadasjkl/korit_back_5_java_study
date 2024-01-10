package com.study.ch15;

public class VipMember extends Member{
    private final String GRADE = "VIP";

    // Member에 Allarg 밖에 없어서
    public VipMember(String name, String phone) {
        super(name, phone); //부모의 생성자 호출
    }
}
