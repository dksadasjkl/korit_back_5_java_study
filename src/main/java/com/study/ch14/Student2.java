package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor // 상수는 무조건 초기화해야 되어서 NoArgsConstructor랑 같이 못씀
@AllArgsConstructor


public class Student2 {
    private final String name; // Setter가 없음
    private String address;
    @NonNull
    // 밑으로만 적용
    // null이 아니어야 하는 경우, 해당 상수를 사용하는 코드에서
    // @NonNull 어노테이션을 추가하여 null 체크를 강제할 수 있습니다.
    private final String phone;
}
