package org.taiyi.switchdemo;

/**
 * @description: Switch 演示程序
 * @author: taiyi
 * @date: 2023-10-26 16:06
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int week = 7;
        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("错误的 week！");
        }
    }
}
