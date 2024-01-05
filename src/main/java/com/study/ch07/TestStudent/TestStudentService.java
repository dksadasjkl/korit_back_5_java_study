package com.study.ch07.TestStudent;

public class TestStudentService {
    boolean isTestStudentService (String string){
        if (string == null){
            return true;
        }
        return string.isBlank();
    }
    void TextServcie (TestStudent testStudent) {
        TestStudentRepository testStudentRepository = new TestStudentRepository();
        testStudentRepository.isTestStudentRepository(testStudent);


    }

}
