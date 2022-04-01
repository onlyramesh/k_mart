package com.kirani.kiranibackendcode.controller;

import com.kirani.kiranibackendcode.entity.Coupons;
import com.kirani.kiranibackendcode.entity.CouponsUpdate;
import com.kirani.kiranibackendcode.service.CouponsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("coupons")
public class CouponsController {

    private CouponsService couponsService;

    public CouponsController(CouponsService couponsService) {
        this.couponsService = couponsService;
    }

    @PostMapping
    public ResponseEntity<Long> saveCoupon(@RequestBody Coupons coupon){
        Long slno=this.couponsService.addCoupon(coupon);
        return ResponseEntity.ok().body(slno);
    }

    @GetMapping
    public ResponseEntity<List<Coupons>> getAllCoupons() {
        List<Coupons> couponsList=this.couponsService.getAllCoupons();
        return ResponseEntity.ok().body(couponsList);
    }

    @PutMapping("/{sl_no}/update-coupon")
    public ResponseEntity<Void>updateCoupons(@RequestBody CouponsUpdate couponsUpdate, @PathVariable Long sl_no){
    try{
        couponsService.updateCoupons(sl_no,couponsUpdate);
        return ResponseEntity.ok().build();
    }catch (Exception e){
        return ResponseEntity.notFound().build();
    }
    }
}
