package com.kirani.kiranibackendcode.service;

import com.kirani.kiranibackendcode.entity.Coupons;
import com.kirani.kiranibackendcode.repository.CouponsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponsService {

    private final CouponsRepository couponsRepository;


    public CouponsService(CouponsRepository couponsRepository) {
        this.couponsRepository = couponsRepository;
    }

    public Long addCoupon(Coupons coupons){
        Coupons newCoupon = this.couponsRepository.save(coupons);
        return newCoupon.getSl_no();
    }

    public List<Coupons> getAllCoupons(){
        return (List<Coupons>) this.couponsRepository.findAll();
    }
}
