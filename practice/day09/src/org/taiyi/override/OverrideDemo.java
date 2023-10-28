package org.taiyi.override;

/**
 * @description: 重写 程序演示
 * @author: taiyi
 * @date: 2023-10-28 19:21
 */
public class OverrideDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();

        Dog dog = new Dog();
        dog.eat();
    }
}
