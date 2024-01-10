package com.study.ch16;

import java.util.ArrayList;

public class StudentListMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("서창일", 31)); //객체추가
        students.add(new Student("서창이", 32));
        students.add(new Student("서창삼", 33));
        students.add(new Student("서창사", 34));

        System.out.println(students); // Student
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i); //
            student.setAge(student.getAge() + 1);
        }
        System.out.println(students);

//             students.get(i).setAge(students.get(i).getAge()+ 1);
        // students. 0번부터 4번까지(주소).셋(인덱스에 age +1)

        // 결과 출력

        // 향상된 for
        // for (Student student : students 배열 [0번부터 대입해서 써라]) {
        //            student.setAge(student.getAge() + 1);
        //        }
        //        System.out.println(students);
        for (Student student : students) {
            student.setAge(student.getAge() + 1);
        }
        System.out.println(students);

        // 람다식
        students.forEach(student -> student.setAge(student.getAge() + 1));

        // 덥어씀
//        students.set()
        Student[] studentArray = new Student[4];
        for (int i = 0; i < studentArray.length; i++) {
            Student student = new Student("서창현", 33);
//            studentArray[i] = new Student("서창", 32);
        }



        // student 임시변수 값 넣는 행위
        // studentArray -> 배열 주소 x -> studentArray
        // studentArray[0] -> 배열에 주소
        int i = 0; 
        for (Student student : studentArray) {
            studentArray[i] = new Student("창서", 31);
            i++;
            System.out.println(student);
        }
        students.set(0, new Student("ㅇㄴㅇㄴㄴㅇ", 31));
    }
}
