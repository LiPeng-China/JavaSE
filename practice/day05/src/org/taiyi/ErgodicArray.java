package org.taiyi;

/**
 * @description: 遍历数组
 * @author: taiyi
 * @date: 2023-10-26 21:37
 */
public class ErgodicArray {
    public static void main(String[] args) {
        int[] ages = {21, 22, 20, 23, 22};

        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        for (int age : ages) {
            System.out.println(age);
        }

        // 平均年龄
        double sum = 0;
        for (int age : ages) {
            sum += age;
        }
        System.out.println("平均年龄: " + sum / ages.length);

        // 最小年龄
        int min = ages[0];
        for (int age : ages) {
            if (min > age) {
                min = age;
            }
        }
        System.out.println("最小年龄： " + min);

        // 最小年龄
        int max = ages[0];
        for (int age : ages) {
            if (max < age) {
                max = age;
            }
        }
        System.out.println("最大年龄： " + max);

    }
}
