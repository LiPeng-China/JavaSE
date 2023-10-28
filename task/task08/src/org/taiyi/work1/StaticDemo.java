package org.taiyi.work1;

/**
 * @description: 静态代码
 * @author: taiyi
 * @date: 2023-10-28 16:32
 */
public class StaticDemo {

    static {
        System.out.println("正在初始化数据 ... ");
    }

    public StaticDemo() {
        System.out.println("这是构造器");
    }

    public static void staticWork() {
        System.out.println("这是静态的 staticWork 方法");
    }

    public void work() {
        System.out.println("这是实例方法");
    }
}
