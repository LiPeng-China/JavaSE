package org.taiyi.work1;

/**
 * @description: 学生类
 * @author: taiyi
 * @date: 2023-10-29 21:25
 */
public class Student {
    private String name;

    private int age;

    private int sn;

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

    @Override
    public String toString() {
        return String.valueOf(this instanceof Object);
    }
}
