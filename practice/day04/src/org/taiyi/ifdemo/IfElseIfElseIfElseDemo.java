package org.taiyi.ifdemo;

/**
 * @description: if...else if ... else if ... else 程序演示
 * @author: taiyi
 * @date: 2023-10-26 15:56
 */
public class IfElseIfElseIfElseDemo {
    public static void main(String[] args) {
        double score = 88;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
