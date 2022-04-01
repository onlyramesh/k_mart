package com.kirani.kiranibackendcode.entity;

public class CouponsUpdate {

    private String coupon_name;
    private int coupon_diss;
    private int coupon_max_times;
    private int coupon_max_amount;

    public CouponsUpdate() {
    }

    public String getCoupon_name() {
        return coupon_name;
    }

    public void setCoupon_name(String coupon_name) {
        this.coupon_name = coupon_name;
    }

    public int getCoupon_diss() {
        return coupon_diss;
    }

    public void setCoupon_diss(int coupon_diss) {
        this.coupon_diss = coupon_diss;
    }

    public int getCoupon_max_times() {
        return coupon_max_times;
    }

    public void setCoupon_max_times(int coupon_max_times) {
        this.coupon_max_times = coupon_max_times;
    }

    public int getCoupon_max_amount() {
        return coupon_max_amount;
    }

    public void setCoupon_max_amount(int coupon_max_amount) {
        this.coupon_max_amount = coupon_max_amount;
    }
}
