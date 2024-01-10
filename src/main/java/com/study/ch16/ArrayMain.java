package com.study.ch16;

public class ArrayMain {
    public static void main(String[] args) {
        String[] initStrArray = new String[0]; //빵개
        ArrayService arrayService = new ArrayService(initStrArray);
        arrayService.add("1 서창현");
        arrayService.add("2 소창현");
        arrayService.add("3 사창현");
        arrayService.add("4 수창현");
        arrayService.add("5 시창현");

        System.out.println(arrayService.toString());
        System.out.println(arrayService.indexOf("5 시창현"));


        arrayService.remove(3);
        System.out.println(arrayService.toString());
        arrayService.remove(0);
        System.out.println(arrayService.toString());

    }

}
