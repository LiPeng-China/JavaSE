package org.taiyi.work2;

/**
 * @description: 用户类
 * @author: taiyi
 * @date: 2023-10-28 16:39
 */
public class User {
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 用户密码
     */
    private String userPassWord;
    /**
     * email地址
     */
    private String email;

    public User(String userId, String userPassWord, String email) {
        this.userId = userId;
        this.userPassWord = userPassWord;
        this.email = email;
    }

    public User() {
    }

    public void showInfo() {
        System.out.println("用户ID:" + this.userId + "\t用户密码:" + this.userPassWord + "\temail:" + this.email);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassWord() {
        return userPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
