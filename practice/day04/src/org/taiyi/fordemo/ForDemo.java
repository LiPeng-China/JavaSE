package org.taiyi.fordemo;

/**
 * @description: for循环 演示程序
 * @author: taiyi
 * @date: 2023-10-26 16:55
 */
public class ForDemo {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
