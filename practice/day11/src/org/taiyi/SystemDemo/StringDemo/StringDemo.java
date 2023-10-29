package org.taiyi.SystemDemo.StringDemo;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-29 20:10
 */
public class StringDemo {
    public static void main(String[] args) {
        String str1 = "sy";
        String str2 = new String("sy");

        System.out.println("两个字符串的内容是否相等：" + str1.equals(str2));

        System.out.println("两个字符串的空间是否是同一块：" + (str1 == str2));

    }
}
