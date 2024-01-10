package com.study.ch16;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ArrayService {
    private String[] strArray;

    public void add(String str) {
        String[] newArray = new String[strArray.length + 1]; // 실행될때 한칸 더 만들기
        for (int i = 0; i < strArray.length; i++) {
            newArray[i] = strArray[i];
        }
        strArray = newArray; // 주소 이전 100주소에 대입 -> 200주소
        strArray[strArray.length - 1] = str; //배열의 끝에
    }

    public  void remove(int index) {
        // 기존보다 크기가 1적은 배열을 새로 만든다.
        // 매개변수로 받은 인덱스의 값을 기준으로자 작은 index들은 그대로 옮기고 큰 인덱슬들은 -1하여 옮긴다.
        // strArray 배열을 새로운 배열로 바꾼다.

        //indexOf 활용
       String[] newArray2 = new String[strArray.length -1]; // 기존보다 크기가 1적은 배열을 새로 만든다.
        for (int i = 0; i < newArray2.length; i++) {
            newArray2[i] = strArray[i < index ? i : i + 1];
//            newArray2[0] = strArray[0 < index ? 0 : 0 + 1];
//            newArray2[1] = strArray[1 < index ? 1 : 1 + 1];
//            newArray2[2] = strArray[2 < 2 ? 2 : 2 + 1];
//            newArray2[3] = strArray[3 < 3 ? 3 : 3 + 1];

        }
        // strArray 배열을 새로운 배열로 교체
        strArray = newArray2;
    }

    public String get(int index) {
        return strArray[index];
    }

    public int indexOf(String str) {
        if (str == null) {
            return -1;
        }

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String result = "Array[ ";

        for (int i = 0; i < strArray.length; i++) {
            result += strArray[i];
            if(i < strArray.length -1) {
                result += ", ";
            }
        }

        result += " ] ";
        return result;
    }
}
