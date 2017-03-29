package me.remin.common.po;

import java.util.Map;

/**
 * Created by Administrator on 2017/1/13.
 *
 * 返回数据封装类
 */
public class ResultData {

    private boolean isSuccess;

    private Integer code;

    private String errorMsg;

    public Map<String,Object> data;

    public ResultData(boolean isSuccess, Integer code, Map<String, Object> data) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.data = data;
    }

    public ResultData(Integer code, String errorMsg) {
        this.code = code;
        this.errorMsg = errorMsg;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
