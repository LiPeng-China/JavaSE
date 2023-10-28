package org.taiyi.interfaces;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-28 20:14
 */
public class Mouse implements USB{
    @Override
    public void user() {
        System.out.println("鼠标插上 USB 使用");
    }
}
