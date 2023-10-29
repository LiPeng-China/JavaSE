package org.taiyi.work2;

/**
 * @description: 战斗机
 * @author: taiyi
 * @date: 2023-10-29 10:18
 */
public class Flighter extends Weapon {
    @Override
    void attack() {
        System.out.println("Flighter 攻击");
    }

    @Override
    void move() {
        System.out.println("Flighter 移动");

    }
}
