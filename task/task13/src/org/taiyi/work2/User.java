package org.taiyi.work2;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-30 21:47
 */
public class User {

    public boolean signIn(String emailOrPhone) {
        if (emailOrPhone.matches("\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}")) {
            return true;
        } else {
            return emailOrPhone.matches("0?(13|14|15|18|17)[0-9]{9}");
        }
    }
}
