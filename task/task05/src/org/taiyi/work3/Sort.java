package org.taiyi.work3;

import java.util.Arrays;

/**
 * @description: 排序练习：先拍偶数，再排奇数
 * @author: taiyi
 * @date: 2023-10-27 11:21
 */
public class Sort {
    public static void main(String[] args) {
        // 0、init
        int[] arr = {30, 28, 19, 17, 33, 25, 6, 77, 10, 9};
        System.out.println("排序前的数组：" + Arrays.toString(arr));

        // 1、偶数在前，奇数在后，以seqIdx记录跟个下标 O(n)
        int[] arr1 = new int[arr.length];
        int seqIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr1[seqIdx++] = arr[i];
            }
        }
        for (int i = 0, j = seqIdx; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr1[j++] = arr[i];
            }
        }

        // 2、偶数排序 O(n^2)
        for (int i = 0; i < seqIdx; i++) {
            for (int j = i + 1; j < seqIdx; j++) {
                if (arr1[i] < arr1[j]) {
                    arr1[i] = arr1[i] ^ arr1[j];
                    arr1[j] = arr1[i] ^ arr1[j];
                    arr1[i] = arr1[i] ^ arr1[j];
                }
            }
        }

        // 3、奇数排序 O(n^2)
        System.out.println(seqIdx);
        for (int i = seqIdx; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] < arr1[j]) {
                    arr1[i] = arr1[i] ^ arr1[j];
                    arr1[j] = arr1[i] ^ arr1[j];
                    arr1[i] = arr1[i] ^ arr1[j];
                }
            }
        }
        System.out.println("排序后的数组：" + Arrays.toString(arr1));

    }
}
