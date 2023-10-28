package org.taiyi.abstracts;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-28 19:38
 */
public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.getArea());

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.getArea());
    }
}
