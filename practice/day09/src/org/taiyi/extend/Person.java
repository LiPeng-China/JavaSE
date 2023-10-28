package org.taiyi.extend;

/**
 * @description: Person 基础类
 * @author: taiyi
 * @date: 2023-10-28 17:23
 */
public class Person {
    static {
        System.out.println("这里是 Person static 代码块");
    }

    private String name;
    private int age;

    public Person() {
        System.out.println("这里是无参 Person 构造器");
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
