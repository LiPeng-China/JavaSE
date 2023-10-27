package org.taiyi.work2;

import java.util.Arrays;

/**
 * @description: 数组拷贝
 * @author: taiyi
 * @date: 2023-10-27 11:08
 */
public class Copy {
    public static void main(String[] args) {
        // 方法1
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};

        int[] arrFinal = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arrFinal[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arrFinal[i + arr1.length] = arr2[i];
        }
        System.out.println(Arrays.toString(arrFinal));

        // 方法2
        arraysUtil();
    }

    public static void arraysUtil() {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};

        int[] arrFinal = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, arrFinal, 0, arr1.length);
        System.arraycopy(arr2, 0, arrFinal, arr1.length, arr2.length);

        // arrFinal[0] = 100;
        // System.out.println(arr1[0]);

        System.out.println(Arrays.toString(arrFinal));
    }
}
