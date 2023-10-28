package org.taiyi;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-28 20:41
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();

        System.out.println(test);


        System.out.println(test.getClass().getName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
