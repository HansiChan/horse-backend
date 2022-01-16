package com.horsefi.horsemain.entity;


public class ResponseEntity {

    int status;
    Object result;

    public ResponseEntity(int status, Object result) {
        this.status = status;
        this.result = result;
    }

}
