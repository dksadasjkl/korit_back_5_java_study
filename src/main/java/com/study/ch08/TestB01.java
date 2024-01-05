package com.study.ch08;

public class TestB01 {
        void add(int[] array, int x, int y) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) { // 생성이 정수값은 0이기 때문에
                    array[i] = x + y;
                    break;
                }
            }
        }

        void showArrayDatas(int[] array){
            System.out.println("배열 값 확인");

            for (int i = 0; i < array.length; i++) {
                System.out.println("index[" + i + "] > " + array[i]);
            }
            System.out.println();
        }
}
