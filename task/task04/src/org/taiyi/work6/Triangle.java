package org.taiyi.work6;

/**
 * @description: 打印三角形
 * @author: taiyi
 * @date: 2023-10-26 20:57
 */
public class Triangle {
    public static void main(String[] args) {
        /*
         i 空格  *
         0  3   1
         1  2   3
         2  1   5
         3  0   7
         */
        int rows = 4;
        for (int i = 0; i < rows; i++) {
            // 打印 空格
            for (int j = 0; j < rows - 1 - i; j++) {
                System.out.print("  ");
            }
            // 打印 *
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
