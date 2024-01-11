package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
    private static ArrayList<Member> members = new ArrayList<>(); // 스태틱으로 공유한다 MemberMain 클래스 내부
                                                                  // -> 메인과 클래스에서 메소드 활용을 위해
    public static  String inputSearchName(String label) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(label + " >> ");
        return scanner.nextLine();//입력받은 값을 리턴해준다 inputSearchName 호출한 지점으로 리턴해준다
    }

    public static Member findMemberByName(String name) {
        for (Member member : members) {
            if (member.getName().equals(name)) { // 찾았으면 maeber 출력 반복을 나와라
              return  member;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                System.out.println("[회원 등록하기]");
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
                String searchName = null;
                System.out.println(" [회원 이름 수정하기] ");
                searchName = inputSearchName("수정 할 회원의 이름응ㄹ 입력하세요");
                Member findMember = findMemberByName(searchName);
                if (findMember == null) {
                    System.out.println("해당 이름의 회원이 존재하지 않습ㄴ디ㅏ. ");
                    continue;
                }
                System.out.print("이름 >> ");
                String updateName = scanner.nextLine();
                findMember.setName(updateName);
                System.out.println("<< 수정 완료");
            } else if ("3".equals(selectedMenu)) {
                /*
                [회원 주소 수정하기]
                수정 할 회원의 이름을 입력하세요 >> 이이이
                주소 >> 부산 동래구 사직동
                << 수정이 완료되었습니다. >>
                 */
                String searchName = null;
                System.out.println(" [회원 주소 수정하기] ");
                searchName = inputSearchName("수정 할 회원의 주소를 입력하세요");
                Member findMember = findMemberByName(searchName);
                if (findMember == null) {
                    System.out.println("해당 회원의 주소 존재하지 않습ㄴ디ㅏ. ");
                    continue;
                }
                System.out.print("주소 >> ");
                String updateAddress = scanner.nextLine();
                findMember.setAddress(updateAddress);
                System.out.println("<< 수정 완료");

            } else if ("4".equals(selectedMenu)) {
                /*
                [회원 이름 조회하기]
                조회 할 회원의 이름을 입력하세요 >> 이이이
                해당 이름의 회원이 존재하지 않습니다.

                Member 객체 toString();
                << 조회이 완료되었습니다. >>
                 */
                String searchName = null;
                System.out.println("[ 회원 이름 조회하기 ]");
                searchName = inputSearchName("조회할 회원의 이름을 입력하세요");

                Member findMember = findMemberByName(searchName);
                    if (findMember == null) {
                        System.out.println("조회할 수 없습니다.");
                        continue; // 다음 반복
                    }
                    System.out.println(findMember);
                    System.out.println("<< 조회가 완료 되었습니다. >>");

            } else if ("5".equals(selectedMenu)) {
                System.out.println(" [ 회원 전체 조회 ]");
                System.out.println("조회가 완료되었습니다.");
                for (Member member : members) {
                    System.out.println(members);
                }
                
               /*
                [회원 이름 전체하기]
                MemberList 전체 반복 toString();
                add
                << 조회이 완료되었습니다. >>
                 */
            } else if ("6".equals(selectedMenu)) {
                String searchName = null;
                System.out.println("[ 회원 이름 삭제하기 ]");
                System.out.print("삭제할 회원의 이름을 입력하세요 >> ");
                searchName = scanner.nextLine();

                Member findMember = null;
                for (Member member : members) {
                    if (member.getName().equals(searchName)) { // 찾았으면 maeber 출력 반복을 나와라
                        findMember = member;
                        break;
                    }


                    if (findMember == null) {
                        System.out.println("해당 이름의 존재 없습니다.");
                        continue;
                   }
                    members.remove(findMember); //해당 주소를
                    System.out.println("조회가 완료되었습니다.");
                }
                
                    /*
                [회원 이름 삭제하기]
                삭회 할 회원의 이름을 입력하세요 >> 이이이
                삭제된 Member.remove. 객체 toString();
                << 삭제이 완료되었습니다. >>
                 */
                // 1번 -> 5번 -> 4번 -> 6번 -> 2번 -> 3

               
            } else {
                System.out.println("다시 선택하세요.");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
}
}

