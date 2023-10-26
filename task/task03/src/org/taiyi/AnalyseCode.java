package org.taiyi;

/**
 * @description: task02：分析代码
 * @author: taiyi
 * @date: 2023-10-26 15:19
 */
public class AnalyseCode {
    public static void main(String[] args) {
        int a = 10;     // a = 10
        a++;            // a = 11
        int b = 20;                 // b = 20
        int c = ++a + b;            // a = 12 b = 20 c = 32
        System.out.println(c++);    // 打印 32 c = 33
    }
}
