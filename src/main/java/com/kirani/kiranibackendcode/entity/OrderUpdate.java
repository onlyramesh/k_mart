package com.kirani.kiranibackendcode.entity;

public class OrderUpdate {

    private int status;
    private String reason;

    public OrderUpdate(){

    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
