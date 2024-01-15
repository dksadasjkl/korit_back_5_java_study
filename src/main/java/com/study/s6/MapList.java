package com.study.s6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
    public static void main(String[] args) {
        List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();
        Map<String, Object> customer1 = new HashMap<>();
        customer1.put("name", "홍길동");
        customer1.put("rating", "vip");
        customer1.put("age", "30");
        customers.add(customer1);

        Map<String, Object> customer2 = new HashMap<>();
        customer2.put("name", "김기영");
        customer2.put("rating", "gold");
        customer2.put("age", "35");
        customers.add(customer2);

        for (Map<String, Object> customer : customers) {
            System.out.println("name="+ customer.get("name"));
            System.out.println("rating="+ customer.get("rating"));
            System.out.println("age="+ customer.get("age"));

        }
    }
}
