package org.taiyi;

/**
 * @description: 条件运算符
 * @author: taiyi
 * @date: 2023-10-26 11:27
 */
public class ConditionOperator {
    public static void main(String[] args) {
        // 三元运算符 (三目运算符)
        String res = false ? "你好" : "你不好";
        System.out.println(res);

        int age = 19;
        String res1 = age >= 18? "可以上网": "拒绝上网";
        System.out.println(res1);
    }
}
