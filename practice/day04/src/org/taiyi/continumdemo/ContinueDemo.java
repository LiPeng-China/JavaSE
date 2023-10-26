package org.taiyi.continumdemo;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-26 17:06
 */
public class ContinueDemo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            if (i == 1 || i == 9) {
                continue;
            }
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
