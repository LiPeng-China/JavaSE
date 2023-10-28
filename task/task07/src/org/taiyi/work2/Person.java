package org.taiyi.work2;

/**
 * @description: 构造器 和 实例方法
 * @author: taiyi
 * @date: 2023-10-28 16:19
 */
public class Person {

    String name;

    public Person() {
        System.out.println("我是无参构造函数");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("我是有参构造函数");
    }

    public void live() {
        System.out.println("我是普通方法");
    }
}
