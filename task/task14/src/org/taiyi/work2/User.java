package org.taiyi.work2;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-31 22:25
 */
public class User {
    private String name;

    private String password;

    public void register(String username, String password) {
        boolean isSuccessEmail = username.matches("\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}");
        boolean isSuccessPhone = username.matches("0?(13|14|15|18|17)[0-9]{9}");

        if (!isSuccessEmail && !isSuccessPhone) {
            throw new RegisterException("账户不是合法的 Email 或者 phone");
        }

        if ("123@qq.com".equals(username)) {
            throw new RegisterException("该账户已注册");
        }

        System.out.println("注册成功");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
