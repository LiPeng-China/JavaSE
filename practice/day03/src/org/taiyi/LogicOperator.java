package org.taiyi;

/**
 * @description: 逻辑运算符
 * @author: taiyi
 * @date: 2023-10-26 11:07
 */
public class LogicOperator {
    public static void main(String[] args) {
        System.out.println(true & false);

        System.out.println(true | false);

        System.out.println(!true);

        System.out.println(true ^ false);

        System.out.println(4 ^ -3);
        System.out.println(Integer.toBinaryString(4));
        System.out.println(Integer.toBinaryString(-3));
        System.out.println(Integer.toBinaryString(4 ^ -3));
    }
}
