package com.kirani.kiranibackendcode.controller;

import com.kirani.kiranibackendcode.entity.City;
import com.kirani.kiranibackendcode.entity.CityUpdate;
import com.kirani.kiranibackendcode.service.CityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("city")
public class CityController {
    private CityService cityService;

    public CityController(CityService service){
        this.cityService=service;
    }

    @PostMapping
    ResponseEntity<Void> saveCity(@RequestBody City city)
    {
        this.cityService.addCity(city);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<City>> getAllCity(){
        List<City> cityList= this.cityService.getAllCity();
    return ResponseEntity.ok().body(cityList);
    }

    @PutMapping("/{sl_no}/city-update")
    public ResponseEntity<Void> updateCity(@RequestBody CityUpdate cityUpdate,@PathVariable Long sl_no){
        try{
            cityService.updateCity(sl_no,cityUpdate);
            return ResponseEntity.ok().build();
        }
        catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }

}
