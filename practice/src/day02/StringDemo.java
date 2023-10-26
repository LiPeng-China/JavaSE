package day02;

/**
 * @description:字符串的简单使用
 * @author: taiyi
 * @date: 2023-10-26 8:43
 */
public class StringDemo {
    public static void main(String[] args) {
        String name = "太一";
        System.out.println(name);
        // 常量池 导致相等
        System.out.println(name == "太一");

        int a = 10;
        int b = 10;
        System.out.println(a == b);
    }
}
