package com.kirani.kiranibackendcode.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
public class City {
    @Id
    @GeneratedValue(Strategy = GenerationType.AUTO)
    private int sl_no;
    
    private String city_name;
    private int minimum_order;
    private String timing;
    private int service_on_off;
    private int deliver_charge;
    private String reserve1;
    private String reserve2; 
}
