package org.taiyi.work1;

/**
 * @description: 练习使用for 和foreach
 * @author: taiyi
 * @date: 2023-10-27 11:05
 */
public class For {
    public static void main(String[] args) {
        int[] ages = {29, 23, 18};

        // for 循环
        System.out.println("=========== for ===========");
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        System.out.println("=========== for each ===========");
        for (int age : ages) {
            System.out.println(age);
        }
    }
}
