/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynn.bean;

/**
 *
 * @author Administrator
 */
public class ResultBean {
    
    private String status;
    private String msg;

    public ResultBean() {
        status = "ok";
    }

    public ResultBean(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }
    
    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
    
}
