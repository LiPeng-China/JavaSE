package org.taiyi.work2;

/**
 * @description: 测试类
 * @author: taiyi
 * @date: 2023-10-29 10:20
 */
public class Test {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.attack();
        tank.move();

        Flighter flighter = new Flighter();
        flighter.attack();
        flighter.move();

        WarShip warShip = new WarShip();
        warShip.attack();
        warShip.move();
    }
}
