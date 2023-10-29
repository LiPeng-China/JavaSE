package org.taiyi.work2;

/**
 * @description: 军舰
 * @author: taiyi
 * @date: 2023-10-29 10:18
 */
public class WarShip extends Weapon{
    @Override
    void attack() {
        System.out.println("WarShip 攻击");
    }

    @Override
    void move() {
        System.out.println("WarShip 移动");

    }
}
