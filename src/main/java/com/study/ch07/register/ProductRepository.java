package com.study.ch07.register;

public class ProductRepository {

    void  saveProduct(Product product) {
        ProductDB productDB = new ProductDB();
        productDB.insertProduct(product);

    }


}
