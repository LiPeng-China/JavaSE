package org.taiyi;

import java.util.Arrays;

/**
 * @description: 二位数组定义
 * @author: taiyi
 * @date: 2023-10-27 9:53
 */
public class Array2D {
    public static void main(String[] args) {
        // 静态定义
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
       // System.out.println(Arrays.toString(arr2));
        for (int[] ints : arr2) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
