package org.taiyi;

/**
 * @description: 测试
 * @author: taiyi
 * @date: 2023-10-27 19:28
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "太一";

        String name = student.name;
        System.out.println(name);

        student.showInfo();

    }
}
