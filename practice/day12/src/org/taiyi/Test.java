package org.taiyi;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-30 8:55
 */
public class Test {
    public static void main(String[] args) {
        // 自动装箱
        Integer integer = 2;

        // 自动拆箱
        int intValue = integer;

        // String 转换成 Integer
        Integer integer1 = new Integer("123");
        Integer integer2 = Integer.valueOf("123");

        // Integer 转换成 String
        String s = integer1.toString();

        // Integer 转换成 int
        int i = integer1;
        int i1 = integer1.intValue();

        // int 转换成 String
        String s1 = i + "";

    }
}
