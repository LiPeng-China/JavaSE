package org.taiyi;

/**
 * @description: 递归 的程序演示
 * @author: taiyi
 * @date: 2023-10-27 15:51
 */
public class RecursionDemo {
    public static void main(String[] args) {
        // 计算 5 的阶乘
        int res = 1;
        for (int i = 1; i < 6; i++) {
            res *= i;
        }
        System.out.println(res);

        // 递归的方法
        System.out.println(recursion(5));
    }

    public static int recursion(int num) {
        if (num == 1) {
            return 1;
        }
        num *= recursion(--num);
        return num;
    }
}
