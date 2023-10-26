package org.taiyi.work4;

/**
 * @description: 计算1000以内所有不能被3整除的整数之和
 * @author: taiyi
 * @date: 2023-10-26 20:47
 */
public class Sum {
    public static void main(String[] args) {

        int sum = 0;
        // 不包括 1000
        for (int i = 1; i < 1000; i++) {
            if (i % 3 != 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);     // sum = 332667

    }
}
