package org.taiyi.work1;

/**
 * @description: 学生类
 * @author: taiyi
 * @date: 2023-10-28 16:11
 */
public class Student {
    /**
     * 学生姓名
     */
    String name;
    /**
     * 学生年龄
     */
    int age;
    /**
     * 学生电话
     */
    String telephone;
    /**
     * 学生家庭住址
     */
    String address;
    /**
     * 存钱时间天数
     */
    int saveMoneyDataCount;
    /**
     * 每天存钱额
     */
    int saveMoneyPerDay;

    public void showSaveMoney() {
        System.out.println("该学生存钱：" + saveMoneyDataCount * saveMoneyPerDay);
    }

}
