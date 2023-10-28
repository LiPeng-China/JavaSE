package org.taiyi.abstracts;

/**
 * @description: 矩形
 * @author: taiyi
 * @date: 2023-10-28 19:40
 */
public class Rectangle extends Graph {
    private int width;

    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
}
