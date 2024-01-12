package com.study.ch21;

import java.util.ArrayList;
import java.util.List;

public class ExceptionMain2 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        // 참조자료형, 배열의 크기?
        nameList.add("1");
        nameList.add("2");
        nameList.add(null);
        nameList.add("4");

        //  null.은 안됨
        // Throwable 상속 받기 때문에 
        // [컴파일러 전] 오류 =  문법적 오류
        // [컴파일러 후] 문법적 오류가 없어서 실행시 발생하는 오류 -> RuntimeException
       try {
           for (int i = 0; i < 5; i++) {
               String name = nameList.get(i);
               if (name.equals("4")) {
                   System.out.println("1 찾음!!");
               }
           }
       } catch (NullPointerException e) {
           e.printStackTrace();
       } catch (IndexOutOfBoundsException e) {
           e.printStackTrace();
       } catch (Exception e) {
           e.printStackTrace();
           System.out.println("예상하지 못하는 예외 -> 최종병기 바로 밑 -> Throwable 최종병기");
       } finally {
           System.out.println("이거는 무조건 실행됨"); // 팅긴 상태 전까지
       }
        System.out.println("프로그램 정상 종료");
    }
}

