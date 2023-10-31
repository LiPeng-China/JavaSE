package org.taiyi.work1;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-31 22:17
 */
public class NotFoundException extends RuntimeException {
    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }
}
