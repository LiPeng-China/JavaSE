package org.taiyi.work5;

/**
 * @description: 打印正方形
 * @author: taiyi
 * @date: 2023-10-26 20:50
 */
public class Square {
    public static void main(String[] args) {
        int width = 10;
        int height = 10;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
         * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * * *
         */
    }
}
