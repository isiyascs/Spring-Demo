package com.qburst.model;

import java.io.Serializable;

public class Greeting implements Serializable {
    private String msg;

    public Greeting(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
