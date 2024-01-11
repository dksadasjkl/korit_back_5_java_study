package com.study.ch18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public interface LambdaMain {
    public static void main(String[] args) {

        ///// Runnable
        // 함수 안에서 함수 정의가 가능해진다.
        // 	매개변수 x,	반환값 x
        Runnable start = () -> {
            System.out.println("프로그램을 실행합니다.");
            System.out.println("데이터를 초기화 합니다.");
            int a = 10;
            int b = 20;
            System.out.println("a + b = " + (a + b));
        };
        start.run();
        ///// Supplier
        // 	매개변수 x,	반환값 o
        Supplier<Integer> supplier1 = () -> 10;

        int a = supplier1.get();

        Supplier<Scanner> scannerInstance = () -> new Scanner(System.in);
//        scannerInstance.get().nextLine();

        ///// Consumer
        // 	매개변수 o,	반환값 x
        Consumer<String> setName = name -> {
            String newName = name + "님";
            System.out.println(newName);
        };
        
        setName.accept("서창현");

        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        
        // str -> System.out.println(str); -> 객체
        Consumer<String> action = str -> System.out.println(str);
        action.accept("서창현");
        
        // 객체 주소만 준것
        strList.forEach(str -> System.out.println(str));

        ///// Function
        // 매개변수 o,	반환값 x
        // 제네릭의 <타입,리턴타입> -> 하나의 매개변수
        Function<Integer, String> fx1 = num -> Integer.toString(num * num);

        String result = fx1.apply(10);
        System.out.println(result);
        
        // num -> {
        //            System.out.println("andThen에 넣은 함수 " + num);
        //            return  "문자열" + num;
        //        }
        // 의 주소값을 리턴받음
        String result2 = fx1.andThen(num -> {
            System.out.println("andThen에 넣은 함수 " + num);
            return  "문자열" + num;
        }).apply(10);

        System.out.println(result2);
        /////  Predicate
        Predicate<Integer> filterFx = num -> num % 2 == 0;
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numList.add(i + 1);
        }
        System.out.println(numList);
        // .stream() -> 스트링객체로 변환해서 카피
        // .filter(filterFx) -> filterFx -> true, false -> true 반복해서 stream()에 넣어라 / false면 x 
        // collect(Collectors.toList()); ->toList 로 변환해서 담아라
        // 뒤도감기 안됨. -> 배열을 가져와서 담아서
        List<Integer> newList = numList.stream().filter(filterFx).collect(Collectors.toList());
        System.out.println(newList);
//        numList.stream(): numList를 스트림으로 변환합니다.
//        .filter(filterFx): filterFx라는 조건을 만족하는 요소들만을 스트림에서 걸러냅니다.
//        .collect(Collectors.toList()): 필터링된 요소들을 새로운 리스트로 수집합니다.
//         System.out.println(newList): 새로운 리스트를 출력합니다.
        // .map에 담아라
        List<Integer> newList2 = numList.stream().map(num -> num * 2).collect(Collectors.toList());
        System.out.println(newList);
//        numList.stream(): numList를 스트림으로 변환합니다.
//         .map(num -> num * 2): 각 요소를 2배로 변환합니다. map은 각 요소에 주어진 함수를 적용한 결과로 새로운 스트림을 생성합니다.
//         .collect(Collectors.toList()): 변환된 요소들을 새로운 리스트로 수집합니다.
//         System.out.println(newList): 새로운 리스트를 출력합니다.

    }
}
