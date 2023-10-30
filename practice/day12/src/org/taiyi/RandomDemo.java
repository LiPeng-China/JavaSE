package org.taiyi;

import java.util.Random;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-30 14:42
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            // [0, 100)
            System.out.println(random.nextInt(100) + 1 + 100);
        }
    }
}
