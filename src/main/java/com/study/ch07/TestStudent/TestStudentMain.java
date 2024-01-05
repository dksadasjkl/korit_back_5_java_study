package com.study.ch07.TestStudent;

import java.util.Scanner;

public class TestStudentMain {
    public static void main(String[] args) {
        TestStudentService testStudentService = new TestStudentService();
        Scanner scanner = new Scanner(System.in);

        String preview = null;
        String todaySubject = null;
        int study = 0;
        String review = null;

        System.out.println("학습 기록 프로그램 실행");

        System.out.print("예습한 내용 입력하세오 : ");
        preview = scanner.nextLine();
        if (testStudentService.isTestStudentService(preview)) {
            System.out.println("다시 입력");
            return;
        }
        System.out.print("오늘한 공부 과목을 입력하세오  ex) 국어, 수학 :");
        todaySubject = scanner.next();
        if (testStudentService.isTestStudentService(todaySubject)) {
            System.out.println("다시 입력");
            return;
        }
        System.out.print("공부한 범위를 입력하세요 : ");
        study = scanner.nextInt();
//        if (testStudentService.isTestStudentService(study)) {
//            System.out.println("다시 입력");
//            return;
//        }
        System.out.print("복습하고자하는 내용을 입력하세요: ");

        review = scanner.nextLine();
        if (testStudentService.isTestStudentService(review)) {
            System.out.println("다시 입력");
            return;
        }

            TestStudent testStudent = new TestStudent(preview, todaySubject, study, review);
            testStudentService.TextServcie(testStudent);

    }
}

