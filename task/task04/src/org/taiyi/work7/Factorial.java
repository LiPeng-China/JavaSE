package org.taiyi.work7;

/**
 * @description: 计算阶乘
 * @author: taiyi
 * @date: 2023-10-26 21:06
 */
public class Factorial {
    public static void main(String[] args) {
        int factorial = 1;
        int i = 10;
        for (int j = i; j > 0; j--) {
            factorial *= j;
        }
        System.out.println(i + "! = " + factorial);     // 5! = 120
    }
}
