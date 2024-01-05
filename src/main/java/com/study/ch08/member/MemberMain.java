package com.study.ch08.member;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();
        Member[] members = new Member[3];

        String selectedMenu =  null;
//        String selectedMenu = new String("null"); 위에 값과 똑같다.


        while (true) {
            System.out.println("[[회원 관리 프로그램]]");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("q. 프로그램 종료하기");

            System.out.print("메뉴 선택 >>>");
            selectedMenu = scanner.nextLine();

            if ("1".equals(selectedMenu)) {
                int emptyCount = 0;
                for (int i = 0; i < members.length; i++) {
                  if (members[i] == null) {
                      emptyCount++;
                  }
                }

                if (emptyCount == 0) {
                    System.out.println("회원을 등록할 수 있습니다");
                    continue;
                }

                boolean responseDeta =  memberService.addMember(members);
                if (responseDeta) {
                    System.out.println("<<< 회원 등록 완료 >>>");
                } else {
                    System.out.println("<<< 회원 등록 취소 >>>");
                }


            } else if ("2".equals(selectedMenu)) { // 대소문자 포함 같으면 true
                System.out.println("<<< 회원 전체 조회 >>>");
                for (int i = 0; i < members.length; i++) {
                    if (members[i] == null){
                        System.out.println("NULL");
                        continue;
                    }
                    System.out.println(members[i].toString());
                }
            }  else if("q".equalsIgnoreCase(selectedMenu)) { // 대소문자 포함 같으면 true
                break;
            }
            else {
                System.out.println("다시 선택하세요.");
            }
        }

        System.out.println();
        System.out.println("<<<프로그램이 종료되었습니다. >>>>");
    }
}
