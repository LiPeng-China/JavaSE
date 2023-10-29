package org.taiyi.work3;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-29 22:36
 */
public class Test {
    public static void main(String[] args) {
        // 效率最好 StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < 1000; i++) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder);
    }
}
