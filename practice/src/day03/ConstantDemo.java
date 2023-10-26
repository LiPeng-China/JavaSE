package day03;

/**
 * @description: 常量
 * @author: taiyi
 * @date: 2023-10-26 9:50
 */
public class ConstantDemo {
    public static void main(String[] args) {
        // 直接打印一个常量
        System.out.println(10);

        final int num = 10;
        // num = 20; java: 无法为最终变量num分配值
        System.out.println(num);
    }
}
