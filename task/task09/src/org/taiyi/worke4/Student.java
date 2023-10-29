package org.taiyi.worke4;

/**
 * @description: 学生类
 * @author: taiyi
 * @date: 2023-10-29 10:31
 */
public class Student {

    /**
     * 学号
     */
    private int sn;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    public Student(int sn, String name, int age) {
        this.sn = sn;
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public void printStudent() {
        System.out.println("Sn=" + this.sn + "\tname=" + this.name + "\tage=" + this.age);
    }

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
