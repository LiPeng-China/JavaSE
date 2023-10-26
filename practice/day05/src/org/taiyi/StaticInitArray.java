package org.taiyi;

/**
 * @description: 数组静态初始化
 * @author: taiyi
 * @date: 2023-10-26 21:26
 */
public class StaticInitArray {
    public static void main(String[] args) {
        // 方式1
        int[] ages = new int[]{21, 22, 20, 23, 22};
        int age = ages[2];
        System.out.println(age);

        // 方式2
        int[] ages1 = {21, 22, 20, 23, 22};
        int age1 = ages1[ages1.length - 1];
        System.out.println(age1);
    }
}
