package com.study.ch11;

import com.study.ch10.ElectronicDeviceMain;

public class FactoryMain {
    public static void main(String[] args) {
        // System 스태틱 상수
        ElectronicDeviceMain.main(null);

        Company company = new Company();

        company.setName("삼성");
        company.showCompanyInfo();
        
        // static 생성 없이 사용가능 -> new 생성해도 카피가 안되고(새 메모리 할당x), 공유한다, 대소문자 구분x
        // static -> static 호출
        // static에서 생성하면 main으로 본다?
        // 고정값을 사용할때 사용
        // 클래스명.
        SamsungCompany.name = "애플";
        SamsungCompany.showCompanyInfo();

        Phone phone1 = new Phone(company);
        Phone phone2 = new Phone(company);
        Phone phone3 = new Phone(company);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

    }
}
