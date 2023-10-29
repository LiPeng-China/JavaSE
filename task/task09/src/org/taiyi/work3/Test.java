package org.taiyi.work3;

/**
 * @description: 测试类
 * @author: taiyi
 * @date: 2023-10-29 10:28
 */
public class Test {
    public static void main(String[] args) {
        Add add = new Add();
        System.out.println("10 + 2 = " + add.cal(10, 2));

        Sub sub = new Sub();
        System.out.println("10 - 2 = " + sub.cal(10, 2));

        Mul mul = new Mul();
        System.out.println("10 * 2 = " + mul.cal(10, 2));

        Divide divide = new Divide();
        System.out.println("10 ÷ 2 = " + divide.cal(10, 2));
    }
}
