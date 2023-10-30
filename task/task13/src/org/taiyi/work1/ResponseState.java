package org.taiyi.work1;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-30 21:43
 */
public enum ResponseState {

    SUCCESS(200, "成功"),
    BAD_REQUEST(400, "请求参数错误"),
    SERVER_ERROR(500, "服务器内部错误"),
    NOT_FOUND(404, "资源找不到");
    private final int code;
    private final String message;

    ResponseState(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
