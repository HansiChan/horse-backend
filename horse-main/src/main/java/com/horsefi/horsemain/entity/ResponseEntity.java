package com.horsefi.horsemain.entity;

/**
 * 返回参数类
 *
 * @author Chenlingu
 * @version V1.0
 * @date Created in 11:48 2021/6/7
 */
public class ResponseEntity {

    int status;
    Object result;

    public ResponseEntity(int status, Object result) {
        this.status = status;
        this.result = result;
    }

}
