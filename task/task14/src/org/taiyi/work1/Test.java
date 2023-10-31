package org.taiyi.work1;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-31 22:18
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 2, 4};

        try {
            System.out.println(search(arr, 1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * 在数组 array 中查找元素 element
     *
     * @param array   目标数组
     * @param element 目标元素
     * @return 目标元素下标
     */
    public static int search(int[] array, int element) throws NotFoundException {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        throw new NotFoundException("找不到元素");

    }
}
