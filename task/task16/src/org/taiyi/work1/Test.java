package org.taiyi.work1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-11-01 22:42
 */
public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        List list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            // [0, 99) -> [1, 100)
            int randomInt = random.nextInt(99) + 1;
            if (randomInt >= 20){
                list.add(randomInt);
            }
        }
        // 打印 list
        System.out.println(list);
    }
}
