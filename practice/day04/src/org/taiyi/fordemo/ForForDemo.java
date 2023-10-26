package org.taiyi.fordemo;

/**
 * @description: 嵌套循环
 * @author: taiyi
 * @date: 2023-10-26 17:11
 */
public class ForForDemo {
    public static void main(String[] args) {
        // 打印一个直角三角形
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
