package com.study.memo;

import com.study.ch08.car.Car;

public class memo {
    // do it java - youtube


    // F5 파일 카피
    // ctrl + y 드래그 삭제
    // ctrl + d 드래그 복사
    // ctrl + Alt + L 코드정렬
    // shift f6 파일명 변경
    // Alt Shift 방향키 > 이동
    // ctrl + o 오버라이딩
    // ctrl + i 추상 메소드만 오버라이딩

    // Boolean, String, Integer 등 -> 참조 자료형 - null, true, false 값이 들어감.
    
    /*
    http 프로토콜 -> 단방향 - 요청 시 응답
     */
    
    /*
    형상 관리 툴
       git(깃) 목적
    1. 파일의 버전 관리
    0       '주'버전 - 전체 기능 변화
    .00     '부'버전 - 기능 추가
    .00     '수'버전 - 오류 수정

     <<<< 버전 관리 방법 >>>>
    LOCAL - git (내 pc)
    [Working Directory] - 현재 상태(과거로 갈 수 있음)
    git add - 선택 올림
    git reset - 내림

    [Staging Area] - 임시 저장소
    git commit - 저장

    [Repository] - 폴더
    head - 커서

    REMOTE - git hub (저장소)
    fetch - 새로고침

    2. 협업
    새로운 정보를 동시 추가 - 충돌
    원래 있던 정보를 변경 - 이후 시간대 작업기준
    git - 필수 입력 : user name, user email
    .git - history 복사, 최상위 폴더에만 추가
    git branch - 필수요소, 시작점, 생성
    merge - "Main"에 병합(commit)
    Clone - 첫 다운로드
    gitignore - 무시할 파일(비밀번호 등)

     */

    /*
    git bash
    경로 - shift + insert
    git init 
    설정 초기화
    git status
    상태 확인
    git add
    추가
    -m
    메세지

     */

    // Car car = new Car(); -> 리터널  상수가 없어서 new를 해야함.
    // new Car(); == 주소 -> 데이터 저장
    // car = 주소값을 받은 변수
    // 참조자료형의 기본값은 null. - > new를해서 줏고를 만들어야함
    
    
    // 상속
    // 자식 클래스에서 오버라이딩하면 업 캐스팅해도 오버라이딩한 값을 사용.
    // -> super. => 부모메소드 호출 -> 생략되어있음



}
