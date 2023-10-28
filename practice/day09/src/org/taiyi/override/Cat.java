package org.taiyi.override;

/**
 * @description: 猫
 * @author: taiyi
 * @date: 2023-10-28 19:20
 */
public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
