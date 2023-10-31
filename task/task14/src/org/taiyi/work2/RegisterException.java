package org.taiyi.work2;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-31 22:29
 */
public class RegisterException extends RuntimeException{
    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}
