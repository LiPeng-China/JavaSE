package org.taiyi.work1;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-26 17:22
 */
public class IfVersion {
    public static void main(String[] args) {
        int month = 0;
        if (month == 1 || month == 2 || month == 3) {
            System.out.println("第一季度");
        } else if (month == 4 || month == 5 || month == 6) {
            System.out.println("第二季度");
        } else if (month == 7 || month == 8 || month == 9) {
            System.out.println("第三季度");
        } else if (month == 10 || month == 11 || month == 12) {
            System.out.println("第四季度");
        } else {
            System.out.println("错误的 month = " + month);
        }
    }
}
