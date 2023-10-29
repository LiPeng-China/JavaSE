package org.taiyi.inner;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-29 11:40
 */
public class Test {
    public static void main(String[] args) {
        ExternalClass externalClass = new ExternalClass();
        ExternalClass.InnerClass innerClassTest = externalClass.new InnerClass();
    }
}
