package org.taiyi.work1;

/**
 * @description: 用户类
 * @author: taiyi
 * @date: 2023-10-29 10:04
 */
public class User {
    private String name;

    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("姓名： " + this.name);
        System.out.println("年龄： " + this.age);
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
