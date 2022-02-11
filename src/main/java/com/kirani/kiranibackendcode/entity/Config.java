package com.kirani.kiranibackendcode.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.DateTimeException;
import java.util.Date;

@Entity
public class Config {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sl_no;

    private int minimum_order;
    private Date delivery_time;
    private Date delivery_start;
    private Date delivery_end;
    private String offers;
    private String contact_no1;
    private String contact_no2;
    private String email;

    public Config(){}

    public Config(int minimum_order, Date delivery_time, Date delivery_start, Date delivery_end, String offers, String contact_no1, String contact_no2, String email) {
        this.minimum_order = minimum_order;
        this.delivery_time = delivery_time;
        this.delivery_start = delivery_start;
        this.delivery_end = delivery_end;
        this.offers = offers;
        this.contact_no1 = contact_no1;
        this.contact_no2 = contact_no2;
        this.email = email;
    }

    public int getMinimum_order() {
        return minimum_order;
    }

    public void setMinimum_order(int minimum_order) {
        this.minimum_order = minimum_order;
    }

    public Date getDelivery_time() {
        return delivery_time;
    }

    public void setDelivery_time(Date delivery_time) {
        this.delivery_time = delivery_time;
    }

    public Date getDelivery_start() {
        return delivery_start;
    }

    public void setDelivery_start(Date delivery_start) {
        this.delivery_start = delivery_start;
    }

    public Date getDelivery_end() {
        return delivery_end;
    }

    public void setDelivery_end(Date delivery_end) {
        this.delivery_end = delivery_end;
    }

    public String getOffers() {
        return offers;
    }

    public void setOffers(String offers) {
        this.offers = offers;
    }

    public String getContact_no1() {
        return contact_no1;
    }

    public void setContact_no1(String contact_no1) {
        this.contact_no1 = contact_no1;
    }

    public String getContact_no2() {
        return contact_no2;
    }

    public void setContact_no2(String contact_no2) {
        this.contact_no2 = contact_no2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
