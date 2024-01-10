package com.study.ch16;

import java.util.ArrayList;

public class StrArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();

        strList.add("a"); // 배열크기 늘리고 추가
        strList.add("b");
        strList.add("c");
        strList.add("d");

        System.out.println(strList);
        System.out.println(strList.get(1)); // ArrayList<String> 리스트에 1번 인덱스
        System.out.println(strList.indexOf("c")); // 인덱스 번호 찾기
        strList.remove(1); // 1번 인덱스 지우기
        System.out.println(strList);

    }
}
