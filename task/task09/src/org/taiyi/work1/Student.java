package org.taiyi.work1;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-29 10:05
 */
public class Student extends User{

    private int sn;

    public Student(String name, int age, int sn) {
        super(name, age);
        this.sn = sn;
    }


    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("学号： " + this.sn);
    }
}
