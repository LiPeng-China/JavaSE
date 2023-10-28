package org.taiyi.work1;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-28 16:35
 */
public class StaticTest {
    public static void main(String[] args) {

        StaticDemo staticDemo = new StaticDemo();

        StaticDemo.staticWork();
        staticDemo.work();
        /*
        正在初始化数据 ...
        这是构造器
        这是静态的 staticWork 方法
        这是实例方法
        */

        System.out.println("=====================================================");

        staticDemo.work();
        StaticDemo.staticWork();
        /*
        正在初始化数据 ...
        这是构造器
        这是实例方法
        这是静态的 staticWork 方法
        */
    }
}
