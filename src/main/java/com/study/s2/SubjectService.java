package com.study.s2;

import java.util.List;

public class SubjectService {
    private List<String> subjects;

    public SubjectService(List<String> subjects) {
        this.subjects = subjects;
    }

    public void showSubjects() {
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println(subjects.get(i));

        }
    }
}
