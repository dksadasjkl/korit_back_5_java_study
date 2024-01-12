package com.study.ch18;

public class AdditionMain {
    public static void main(String[] args) {


        //익명 클래스
        Addition addition = new Addition() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };
        Addition addition2 = new AdditionImpl();
        System.out.println(addition.add(10, 20));
        System.out.println(addition2.add(30, 40));
        
        // 람다식 핵심조건 -> ***인터페이스 안에 딱 하나의 추상메소드만 정의되어 있어야 한다!***
        // 단, 일단(default) 메소드는 여러개 정의되어 있어도 된다.
        // [  "->"  는 == "add()" 와 동일  ]
        // 생성 및 재정의 -> 추상메소드는 하나기 때문에
        // 매개변수 자료형은 생략가능하다, 변수명은 변경할 수 있다 -> 이미 정의되어있기 때문에
        Addition addition3 = (int a,int b) -> {
            System.out.println("람다식으로 구현한 add메소드");
            return a + b;
        };

        System.out.println(addition3.add(50,50505050));

        // 1. 람다식 매개변수 자료형은 생략할 수 있다.
        Addition addition4 = (x, y) ->  {
            return x + y;
        };

        // 2. 함수의 실행문이 하나의 명령문만 실행된다면 중관호를 생략할 수 있다.
        // 단, return은 중괄호를 생략할 시에 같이 생략한다. //return 자료형은 추상의 정의된 자료형에따라
        Addition addition5 = (x, y) -> x + y; // x + y 앞에 리턴생략된것

        Viewer viewer1 = (viewData) -> {
            System.out.println("화면출력");
        };

        Viewer viewer2 = (viewData) -> System.out.println("화면출력");

        // 3. 매개변수가 1개면 매개변수의 괄호를 생략할 수 있다. -> 2개 이상은 안된다.
        Viewer viewer3 = viewData -> System.out.println("화면출력");
    }
}
