package org.taiyi.extend;

/**
 * @description: 学生类
 * @author: taiyi
 * @date: 2023-10-28 17:11
 */
public class Student extends Person {

    static {
        System.out.println("这里是 Student static 代码块");
    }

    private int sn;

    public Student() {
        System.out.println("这里是无参 Student 构造器");
    }

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }
}
