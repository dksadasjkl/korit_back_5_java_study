package com.study.ch07.register;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) { //main 절차지향언어 - 순서대로
        ProductService productService = new ProductService();

        Scanner scanner = new Scanner(System.in);
        String productName = null;
        String productCode = null;
        long productPrice = 0;
        // main에서만 메모리할당

        System.out.println("상품 등록 프로그램");
        System.out.print("상품명>>> ");
        productName = scanner.nextLine();
        if (productService.isEmptyValidString(productName)) {  //리턴이 boolean이면 is
            System.out.println("상품명을 다시 입력하세요. ");
            return;
        }

        System.out.print("상품코드번호 (예 : P20240000)>>> ");
        productCode = scanner.nextLine();
        if (productService.isEmptyValidString(productCode)) {
            System.out.println("상품코드번호을 다시 입력하세요. ");
            return;
        }

        System.out.print("가격>>> ");
        productPrice = scanner.nextLong();

        Product product = new Product(productName, productCode, productPrice); //생성자 호출
        productService.registerProductService(product);

    }
}
