package org.taiyi;

/**
 * @description: 两个变量的交换
 * @author: taiyi
 * @date: 2023-10-27 10:03
 */
public class SwapDemo {
    public static void main(String[] args) {
        // 1 中间变量 temp
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

        // 2 异或的方式
        int c = 1;
        int d = 2;
        c = c ^ d;
        d = c ^ d;
        c = c ^ d;
        System.out.println(c);
        System.out.println(d);
    }
}
