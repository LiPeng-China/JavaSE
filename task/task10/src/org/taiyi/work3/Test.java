package org.taiyi.work3;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-29 22:07
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Student.Study study = student.new Study();
        study.studyJava();
    }
}
