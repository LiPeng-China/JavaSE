package org.taiyi;

/**
 * @description: static 关键字
 * @author: taiyi
 * @date: 2023-10-27 20:27
 */
public class StaticDemo {
    static {
        System.out.println("这里是 static 修饰的代码块");
    }

    public StaticDemo() {
        System.out.println("这里是构造函数");
    }

    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
    }
}
