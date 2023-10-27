package org.taiyi;

import java.util.Arrays;

/**
 * @description: 冒泡排序程序演示
 * @author: taiyi
 * @date: 2023-10-27 10:18
 */
public class BubbleSortDemo {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int[] heights = {9, 2, 6, 7, 4, 1};
        System.out.println(Arrays.toString(heights));
        for (int i = 0; i < heights.length - 1; i++) {
            for (int j = 0; j < heights.length - 1 - i; j++) {
                if (heights[j] > heights[j + 1]) {
                    heights[j] = heights[j] ^ heights[j + 1];
                    heights[j + 1] = heights[j] ^ heights[j + 1];
                    heights[j] = heights[j] ^ heights[j + 1];
                }
            }
        }
        System.out.println(Arrays.toString(heights));
    }
}
