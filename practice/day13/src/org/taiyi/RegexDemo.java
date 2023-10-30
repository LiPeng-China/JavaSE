package org.taiyi;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-30 15:12
 */
public class RegexDemo {
    public static void main(String[] args) {
        String str = "\\";

        System.out.println(str.matches("\\\\"));

        System.out.println("d".matches("abc"));
    }
}
