package com.study.ch07.register;

public class ProductService {

    boolean isEmptyValidString(String str) {
        if(str == null) {
            return true;
        }
        return str.isBlank(); //null이 아니여서 주소참조 가능
                                // isEmpty() - 공백체크 x, isBlank() - 스페이스 제거후 공백체크
    }

    void  registerProductService (Product product) {
        ProductRepository productRepository = new ProductRepository();
        System.out.println("서비스 까지 데이터 전달함.");
        productRepository.saveProduct(product); // 주소넘기기

    }
}
