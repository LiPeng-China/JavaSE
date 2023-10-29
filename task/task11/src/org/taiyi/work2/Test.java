package org.taiyi.work2;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-29 22:14
 */
public class Test {
    public static void main(String[] args) {
        String str = "hjiad-hg-u-hj-ka-dfhgsiu-g";

        // 以 - 分割字符串并返回数组
        String[] strings = str.split("-");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("====================================");

        // 查找特定的字符串
        System.out.println("str 是否包含 hj：" + str.contains("hj"));
        System.out.println("====================================");

        // 电子邮件验证
        verify("taiyi@wy.163");

    }

    public static void verify(String email) {
        // 1、是能包含一个 @
        String[] split = email.split("@");
        if (split.length != 2) {
            System.out.println("该 email 包含 " + (split.length - 1) + " 个 @ 符号，不合法！");
            return;
        }

        // 2、以 .163 为后缀
        if (!email.endsWith(".163")) {
            System.out.println("该 email 不是 以 .163 为后缀，不合法！");
            return;
        }

        // 3、不能有 “_” “ ” 特殊字符
        if (email.contains("_") || email.contains(" ")) {
            System.out.println("该 email 包含特殊字符，不合法！");
            return;
        }

        System.out.println("该 email 是合法的。");
    }
}
