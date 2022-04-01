package com.kirani.kiranibackendcode.service;

import com.kirani.kiranibackendcode.entity.Config;
import com.kirani.kiranibackendcode.entity.ConfigUpdate;
import com.kirani.kiranibackendcode.entity.Coupons;
import com.kirani.kiranibackendcode.entity.CouponsUpdate;
import com.kirani.kiranibackendcode.repository.CouponsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    private Coupons findById(Long sl_no) {
        Optional<Coupons> optionalConfig = couponsRepository.findById(sl_no);
        if(optionalConfig.isPresent()){
            return optionalConfig.get();
        }
        else{
            throw new RuntimeException();
        }
    }

    public void updateCoupons(Long sl_no, CouponsUpdate couponsUpdate){
        Coupons coupons1= findById(sl_no);
        coupons1.setCoupon_name(couponsUpdate.getCoupon_name());
        coupons1.setCoupon_diss(couponsUpdate.getCoupon_diss());
        coupons1.setCoupon_max_amount(couponsUpdate.getCoupon_max_amount());
        coupons1.setCoupon_max_times(couponsUpdate.getCoupon_max_times());
        couponsRepository.save(coupons1);
    }



}
