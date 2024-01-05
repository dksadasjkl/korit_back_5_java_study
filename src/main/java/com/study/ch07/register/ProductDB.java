package com.study.ch07.register;

public class ProductDB {

    void  insertProduct(Product product) {
        System.out.println("DB에 Insert 완료");
        System.out.println("Insert 내용");
        System.out.println("name : " + product.name);
        System.out.println("code : " + product.code);
        System.out.println("price : " + product.price);
        System.out.println();
    }
}
