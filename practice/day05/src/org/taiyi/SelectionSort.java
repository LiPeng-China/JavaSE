package org.taiyi;

import java.util.Arrays;

/**
 * @description: 选择排序
 * @author: taiyi
 * @date: 2023-10-27 10:35
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] heights = {9, 2, 6, 7, 4, 1};
        System.out.println(Arrays.toString(heights));

        for (int i = 0; i < heights.length - 1; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[i] > heights[j]) {
                    heights[i] = heights[i] ^ heights[j];
                    heights[j] = heights[i] ^ heights[j];
                    heights[i] = heights[i] ^ heights[j];
                }
            }
        }

        System.out.println(Arrays.toString(heights));
    }
}
