package org.taiyi.work1;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-27 16:11
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = {30, 28, 19, 17, 33, 25, 6, 77, 10, 9};
        System.out.print("排序前的数组：");
        printArray(arr);

        // 偶数在前、奇数在后
        arr = evenOddSort(arr);

        int seqIdx = findSeqIdx(arr);

        // 排序
        sort(arr, 0, seqIdx);
        sort(arr, seqIdx, arr.length);

        System.out.print("排后的数组：");
        printArray(arr);
    }

    /**
     * 打印数组
     *
     * @param arr 待打印的数组
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[" + arr[i] + ", ");
            } else if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    /**
     * 偶数排在前面，奇数排在后面
     *
     * @param arr 待排数组
     * @return 排序后的数组
     */
    public static int[] evenOddSort(int[] arr) {
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

        return arr1;
    }

    /**
     * 找到偶数与奇数的分界索引
     *
     * @param arr 待找数组
     * @return 偶数和奇数的分界索引 seqIdx
     */
    public static int findSeqIdx(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 对数组的制定区间进行排序 降序 选择排序
     *
     * @param arr   待排数组
     * @param start 待排区间的开始位置
     * @param end   待排区间的结束位置
     */
    public static void sort(int[] arr, int start, int end) {
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] < arr[j]) {
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                }
            }
        }
    }
}
