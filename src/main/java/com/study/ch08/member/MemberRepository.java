package com.study.ch08.member;

public class MemberRepository {
    Member[] members = new Member[3];

    int insert(Member[] members, Member member) {
        //객체는 최초 값은 null ->그러면 main에서 가져와야겟네? -> 초급자
        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                members[i] = member;
                break;
            }
        }
        System.out.println("저장소에 Member 저장");
        System.out.println(member.toString());
        return 1;
    }
}
