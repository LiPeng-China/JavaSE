package org.taiyi.abstracts;

/**
 * @description: 圆
 * @author: taiyi
 * @date: 2023-10-28 19:37
 */
public class Circle extends Graph {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return 3.14 * this.r * this.r;
    }
}
