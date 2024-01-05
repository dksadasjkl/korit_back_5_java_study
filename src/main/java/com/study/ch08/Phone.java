package com.study.ch08;

public class Phone {
    String company;
    String modelName;

    Phone(String company, String modelName) {
        this.company = company;
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "company='" + company + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }

}
