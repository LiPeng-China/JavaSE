package org.taiyi.whiledemo;

/**
 * @description: do while 演示程序
 * @author: taiyi
 * @date: 2023-10-26 16:41
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        int num = 11;
        do {
            num++;
            System.out.println("播放音乐： " + num);
        } while (num < 10);
    }
}
