package org.taiyi.whiledemo;

/**
 * @description:while 循环演示程序
 * @author: taiyi
 * @date: 2023-10-26 16:34
 */
public class WhileDemo {
    public static void main(String[] args) {

        // 需求一：播放音乐10次
        int count = 0;
        while (count < 10) {
            System.out.println("播放音乐： " + count);
            count++;
        }

        // 需求二：累加求和
        int sum = 0;
        int i = 0;
        while (i < 5) {
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);
    }
}
