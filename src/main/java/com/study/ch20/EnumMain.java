package com.study.ch20;

public class EnumMain {
    public static void main(String[] args) {
        Status status = Status.OK;
        Status status1 = Status.BADREQUEST;

        System.out.println(status); // new Status(200, "정상적인 요청");
        System.out.println(status1);
    }
}
