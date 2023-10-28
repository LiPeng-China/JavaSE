package org.taiyi.override;

/**
 * @description: 狗
 * @author: taiyi
 * @date: 2023-10-28 19:20
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
