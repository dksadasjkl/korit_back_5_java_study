package com.study.ch17;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        // Set + ArrayList
        // 데이터 중복 o, 키값은 중복 x
        HashMap<String, String> map = new HashMap<>();
        
        map.put("username", "seo");
        map.put("password", "이창현");
        map.put("name", "삼창현");
        map.put("emall", "사창현");

        System.out.println(map);
        // 클래스의 형태와 비슷 변수.get(username)
        System.out.println(map.get("username")); // 키값에 담긴 값 호출
    }
}
