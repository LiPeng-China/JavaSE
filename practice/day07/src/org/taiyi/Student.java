package org.taiyi;

/**
 * @description: 学生类
 * @author: taiyi
 * @date: 2023-10-27 19:22
 */
public class Student {
    /**
     * 姓名
     */
    String name;
    /**
     * 年龄
     */
    int age;
    /**
     * 学号
     */
    int sn;
    /**
     * 家庭住址
     */
    String address;

    /**
     * 展示学生个人信息
     */
    public void showInfo() {
        System.out.println(name + " : " + age + " : " + sn + " : " + address);
    }
}
