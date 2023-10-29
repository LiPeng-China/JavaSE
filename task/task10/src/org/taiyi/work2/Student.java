package org.taiyi.work2;

/**
 * @description: 学生类
 * @author: taiyi
 * @date: 2023-10-29 21:25
 */
public class Student {
    private int sn;

    private String name;

    private int age;

    public Student() {
    }

    public Student(int sn, String name, int age) {
        this.sn = sn;
        this.name = name;
        this.age = age;
    }

    public void printStudent() {
        System.out.println("Sn=" + this.sn + "\tname=" + this.name + "\tage=" + this.age);
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

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

}
