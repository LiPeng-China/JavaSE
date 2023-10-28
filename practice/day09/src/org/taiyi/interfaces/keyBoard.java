package org.taiyi.interfaces;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-28 20:16
 */
public class keyBoard implements USB{
    @Override
    public void user() {
        System.out.println("键盘使用 USB");
    }
}
