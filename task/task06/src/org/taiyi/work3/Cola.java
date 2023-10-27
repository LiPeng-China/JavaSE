package org.taiyi.work3;

/**
 * @description: 递归计算 100个瓶盖可以兑换多少瓶可乐，三个瓶盖 == 一瓶可乐
 * @author: taiyi
 * @date: 2023-10-27 16:44
 */
public class Cola {
    public static void main(String[] args) {
        System.out.println(exchange(100));
    }

    public static int exchange(int num) {
        if (num < 3) {
            return 0;
        }
        return 1 + exchange(num - 3);
    }
}
