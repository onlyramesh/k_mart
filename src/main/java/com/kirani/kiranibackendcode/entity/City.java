package com.kirani.kiranibackendcode.entity;

import javax.persistence.*;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
@Table(name="city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sl_no;
    
    private String city_name;
    private int minimum_order;
    private String timing;
    private int service_on_off;
    private int deliver_charge;
    private int reserve1;
    private int reserve2;

    public City(){}

    public City(Long sl_no, String city_name, int minimum_order, String timing, int service_on_off, int deliver_charge, int reserve1, int reserve2) {
        this.sl_no = sl_no;
        this.city_name = city_name;
        this.minimum_order = minimum_order;
        this.timing = timing;
        this.service_on_off = service_on_off;
        this.deliver_charge = deliver_charge;
        this.reserve1 = reserve1;
        this.reserve2 = reserve2;
    }

    public Long getSl_no() {
        return sl_no;
    }

    public void setSl_no(Long sl_no) {
        this.sl_no = sl_no;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public int getMinimum_order() {
        return minimum_order;
    }

    public void setMinimum_order(int minimum_order) {
        this.minimum_order = minimum_order;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public int getService_on_off() {
        return service_on_off;
    }

    public void setService_on_off(int service_on_off) {
        this.service_on_off = service_on_off;
    }

    public int getDeliver_charge() {
        return deliver_charge;
    }

    public void setDeliver_charge(int deliver_charge) {
        this.deliver_charge = deliver_charge;
    }

    public int getReserve1() {
        return reserve1;
    }

    public void setReserve1(int reserve1) {
        this.reserve1 = reserve1;
    }

    public int getReserve2() {
        return reserve2;
    }

    public void setReserve2(int reserve2) {
        this.reserve2 = reserve2;
    }
}
