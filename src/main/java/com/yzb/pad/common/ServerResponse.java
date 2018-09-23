package com.yzb.pad.common;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

/**
 * 返回值
 *
 * @param <T>
 */

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//保证序列化 json 的时候，如果 null 的对象 key 消失
public class ServerResponse<T> implements Serializable {
    private int code;
    private String message;
    private T data;

    private ServerResponse(int code) {
        this.code = code;
    }

    private ServerResponse(int code, T data) {
        this.code = code;
        this.data = data;
    }

    private ServerResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private ServerResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getcode() {
        return code;
    }


    public String getmessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    //正确信息
    public static <T> ServerResponse<T> createBySuccess() {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> ServerResponse<T> createBySuccessmessage(String message) {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), message);
    }

    public static <T> ServerResponse<T> createBySuccess(T data) {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), data);
    }

    public static <T> ServerResponse<T> createBySuccess(String message, T data) {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), message, data);
    }

    //错误信息
    public static <T> ServerResponse<T> createByError() {
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getDesc());
    }

    public static <T> ServerResponse<T> createByErrormessage(String errormessage) {
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(), errormessage);
    }


    public static <T> ServerResponse<T> createByErrorCodemessage(int errorCode, String errormessage) {
        return new ServerResponse<T>(errorCode, errormessage);
    }


}
