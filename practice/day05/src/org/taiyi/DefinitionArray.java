package org.taiyi;

/**
 * @description: 定义数组
 * @author: taiyi
 * @date: 2023-10-26 21:15
 */
public class DefinitionArray {
    public static void main(String[] args) {
        int[] ages = new int[5];
        ages[0] = 21;
        ages[1] = 22;
        ages[2] = 20;
        ages[3] = 23;
        ages[4] = 22;

        System.out.println(ages.length);

        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
    }
}
