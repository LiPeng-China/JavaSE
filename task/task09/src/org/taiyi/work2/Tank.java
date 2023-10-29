package org.taiyi.work2;

/**
 * @description: 坦克
 * @author: taiyi
 * @date: 2023-10-29 10:17
 */
public class Tank extends Weapon{
    @Override
    void attack() {
        System.out.println("Tank 攻击");
    }

    @Override
    void move() {
        System.out.println("Tank 移动");

    }
}
