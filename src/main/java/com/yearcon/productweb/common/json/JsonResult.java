package com.yearcon.productweb.common.json;

import lombok.Data;

/**
 * @author ayong
 * @create 2018-03-02 11:02
 **/
@Data
public class JsonResult {
    private boolean success;
    private String  msg;
    private Object data;

    public JsonResult(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public JsonResult(boolean success, String msg, Object data) {
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public JsonResult() {
    }
}
