package org.taiyi.work2;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-27 16:30
 */
public class Function {
    public static void main(String[] args) {

        // 1、整数相加
        System.out.println(sum(1, 2));

        // 2、小数相加
        System.out.println(sum(1.5, 2.9));

        // 3、整数的四则运算
        System.out.println(fourRuleOperation(1, 2, '+'));
        System.out.println(fourRuleOperation(1, 2, '-'));
        System.out.println(fourRuleOperation(1, 2, '*'));
        System.out.println(fourRuleOperation(1, 2, '/'));
    }

    /**
     * 整数加法
     *
     * @param num1 加数1
     * @param num2 加数2
     * @return 加法结果
     */
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * 小数加法
     *
     * @param num1 加数1
     * @param num2 加数2
     * @return 加法结果
     */
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * 整数的四则运算
     * 考虑到两个整数的除法结果可能会是小数，因此方法的返回值定义成 double。如果定义成int，除法小数点后面的值会被舍去，出现精度损失。
     *
     * @param num1 操作数1
     * @param num2 操作数2
     * @param mode 四则运算： + - * /
     * @return 四则运算结果
     */
    public static double fourRuleOperation(int num1, int num2, char mode) {
        switch (mode) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return (double) num1 / num2;
            default:
                throw new RuntimeException("错误的 mode = " + mode);
        }
    }
}
