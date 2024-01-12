package com.study.ch20;


import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public enum Status {
    OK(200, "정상적인 요청"),
    BADREQUEST(100, "비정상 적인 요청");

    private int code;
    private String statusName;
}
