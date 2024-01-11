package com.study.ch17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

public class HashSetMain {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("서창현");
        nameList.add("서창현");
        nameList.add("서창현");
        nameList.add("서창현");
        nameList.add("서창현");
        nameList.add("박창현");
        nameList.add("우창현");
        nameList.add("최창현");
        // 순서, 중복이 없음
        // 중복 제거할 때 사용
        // 수정 x -> 무조건 반복으로 꺼내고, 다시 넣어야함.
        HashSet<String> names = new HashSet<>();
        // 자동정렬 -> 16 -> 17부터는 퍼센트해서 넣음.
        names.addAll(nameList); // 컬렉션을 상속 받기 때문에 ArrayList도 가능
        System.out.println(names);

        ArrayList<String> newNameList = new ArrayList<>();
        newNameList.addAll(names);
//        newNameList.addAll(0, names); // 해당 리스트부터 names의 값을 넣어라
        System.out.println(newNameList.get(3));
        newNameList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Objects.hash(o1) - Objects.hash(o2);
            }
        });

        System.out.println(Objects.hash("서창현"));
        System.out.println(Objects.hash("박창현"));
        System.out.println(Objects.hash("우창현"));
        System.out.println(Objects.hash("최창현"));
        System.out.println(names);

        String findName = null;
        for (String name : names) {
            if (name.equals("서창현")){
                findName = name;
                break;
            }
        }
        System.out.println(findName);
    }
}
