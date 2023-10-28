package org.taiyi.work3;

/**
 * @description: 学生类
 * @author: taiyi
 * @date: 2023-10-28 16:46
 */
public class Student {
    private String sn;

    private String name;

    private int age;

    private int status;

    public Student(String sn, String name, int age, int status) {
        this.sn = sn;
        this.name = name;
        this.age = age;
        if (status != 0 && status != 1) {
            throw new RuntimeException("错误的学生状态赋值 status=" + status);
        } else {
            this.status = status;
        }
    }

    public Student() {
    }

    public void study() {
        System.out.println("姓名：" + this.name);
        System.out.println("学习状态：" + this.status);
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        if (status != 0 && status != 1) {
            throw new RuntimeException("错误的学生状态赋值 status=" + status);
        }
        this.status = status;
    }
}
