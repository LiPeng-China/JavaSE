package org.taiyi.breakdemo;

/**
 * @description: break 演示程序
 * @author: taiyi
 * @date: 2023-10-26 17:01
 */
public class BreakDemo {
    public static void main(String[] args) {
        int num = 1;
        while (true) {
            System.out.println("num: " + num);
            num++;
            if (num > 10) {
                break;
            }
        }
    }
}
