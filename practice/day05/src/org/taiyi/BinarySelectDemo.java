package org.taiyi;

/**
 * @description: 二分查找
 * @author: taiyi
 * @date: 2023-10-27 10:46
 */
public class BinarySelectDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 8, 9, 11, 12, 16};

        int num = 0;

        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            // 中间元素的索引
            int mid = (max + min) >> 1;
            // 中间元素的值
            int midValue = arr[mid];

            if (midValue < num) {
                min = mid + 1;
            } else if (midValue > num) {
                max = mid - 1;
            } else {
                System.out.println(num + " 所在的位置： " + mid);
                break;
            }
        }

        if (min > max){
            System.out.println("arr 中没有该元素");
        }

    }
}
