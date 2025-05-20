package com.example.myapp.Reult;

public class Result {
    private int code; // 状态码
    private String message; // 响应消息
    private Object data; // 响应数据

    // 构造方法
    public Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // Getter 和 Setter 方法
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    // 新增 success 方法
    public static Result success(Object data) {
        return new Result(200, "成功", data);
    }

    // 新增 error 方法
    public static Result error(int code, String message) {
        return new Result(code, message, null);
    }
}