package com.study.ch21;

import lombok.Getter;

import java.util.Map;
import java.util.Objects;

@Getter
public class ResponseException extends RuntimeException{
    private Map<String, Object> errorMap;

    public ResponseException(String message){
        super(message);
    }

    public ResponseException(String message,  Map<String, Object> errorMap) {
        super(message); // 부모객체 생성
        this.errorMap = errorMap;
    }
}
