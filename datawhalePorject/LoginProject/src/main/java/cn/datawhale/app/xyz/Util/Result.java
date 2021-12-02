package cn.datawhale.app.xyz.Util;

import java.util.Objects;

public class Result {
    private boolean flag; // 是否成功
    private Integer code; // 返回码
    private String message; // 返回信息
    private Object data;// 返回数

    public Result(Integer code,String message,Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public Integer getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
