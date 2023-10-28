package org.taiyi.work1;

/**
 * @description: Student 测试类
 * @author: taiyi
 * @date: 2023-10-28 16:15
 */
public class StudentTest {
    public static void main(String[] args) {
        // 1、实例化对象
        Student student = new Student();

        // 2、赋值
        student.name = "太一";
        student.age = 19;
        student.telephone = "11122223333";
        student.saveMoneyDataCount = 30;
        student.saveMoneyPerDay = 100;

        // 3、打印
        student.showSaveMoney();
    }
}
