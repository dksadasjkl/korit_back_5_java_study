package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Member> members = new ArrayList<>();
        String selectedMenu = null;
        
        while (true) {
            System.out.println("회원 관리 프로그램");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 이름 수정");
            System.out.println("3. 회원 주소 수정");
            System.out.println("4. 회원 이름으로 조회");
            System.out.println("5. 회원 전체 조회");
            System.out.println("6. 회원 삭제");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >>");
            selectedMenu = scanner.nextLine();

            if ("q".equalsIgnoreCase(selectedMenu)) {
                break;
            } else if ("1".equals(selectedMenu)) {
                /*
                [회원 등록하기]
                이름 >> 일일일
                주소 >> 부산 일일구
                << 등록이 완료되었습니다. >>
                ArrayList<Member> 추가
                 */
                String name = null;
                String address = null;

                System.out.print("이름 >>> ");
                name = scanner.nextLine();
                System.out.print("주소 >>> ");
                address = scanner.nextLine();
                members.add(new Member(name,address));
                System.out.println("등록이 완료되었습니다. \n[이름: " + name + "]" + "[주소 :" + address + "]");
                System.out.println();

            } else if ("2".equals(selectedMenu)) {
                /*
                [회원 이름 수정하기]
                수정 할 회원의 이름을 입력하세요 >> 일일일
                이름 >> 이이이
                << 수정이 완료되었습니다. >>
                 */
            } else if ("3".equals(selectedMenu)) {
                /*
                [회원 이름 수정하기]
                수정 할 회원의 이름을 입력하세요 >> 이이이
                주소 >> 부산 동래구 사직동
                << 수정이 완료되었습니다. >>
                 */
            } else if ("4".equals(selectedMenu)) {
                /*
                [회원 이름 조회하기]
                조회 할 회원의 이름을 입력하세요 >> 이이이
                해당 이름의 회원이 존재하지 않습니다.

                Member 객체 toString();
                << 조회이 완료되었습니다. >>
                 */

                System.out.print("조회할 회원의 이름을 입력하세요 >> ");
                String inquiryName = scanner.nextLine();
                if (inquiryName.equals(inquiryName)){
                    for (int i = 0; i < members.size(); i++) {
                    Member member = members.get(i);
                        System.out.println("조회된 이름 : " + member.getName());
                        System.out.println("전제 리스트 : " + member.toString());
                    }
                }


            } else if ("5".equals(selectedMenu)) {
                System.out.println();
                for (int i = 0; i < members.size(); i++) {
                    System.out.println(members.toString());
                }
                System.out.println("조회가 완료되었습니다.");
               /*
                [회원 이름 전체하기]
                MemberList 전체 반복 toString();
                add
                << 조회이 완료되었습니다. >>
                 */
            } else if ("6".equals(selectedMenu)) {
                    /*
                [회원 이름 삭제하기]
                삭회 할 회원의 이름을 입력하세요 >> 이이이
                삭제된 Member.remove. 객체 toString();
                << 삭제이 완료되었습니다. >>
                 */
                // 1번 -> 5번 -> 4번 -> 6번 -> 2번 -> 3번

                System.out.print("삭제 할 회원의 이름을 입력하세요 >> ");
                String inquiryName = scanner.nextLine();
                if (inquiryName.equals(inquiryName)){
                    for (int i = 0; i < members.size(); i++) {
                        Member member = members.get(i);
                        members.remove( member.getName().equals(inquiryName));
                        System.out.println("전제 리스트 : " + member.toString());
                    }
                }
            } else {
                System.out.println("다시 선택하세요.");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
