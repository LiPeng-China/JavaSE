package org.taiyi.work2;

/**
 * @description: User测试类
 * @author: taiyi
 * @date: 2023-10-28 16:43
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User("太一", "123456", "taiyi@qq.com");
        user.showInfo();
    }
}
