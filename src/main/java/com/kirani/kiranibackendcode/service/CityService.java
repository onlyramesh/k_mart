package com.kirani.kiranibackendcode.service;

import com.kirani.kiranibackendcode.entity.City;
import com.kirani.kiranibackendcode.entity.CityUpdate;
import com.kirani.kiranibackendcode.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public void addCity(City city){
        this.cityRepository.save(city);
    }

    public List<City> getAllCity(){

        return (List<City>) this.cityRepository.findAll();
    }

    public City findByID(Long sl_no){
        Optional<City> optionalCity = cityRepository.findById(sl_no);
        if(optionalCity.isPresent()){
            return optionalCity.get();
        }
        else{
            throw new RuntimeException();
        }
    }

    public void updateCity(Long sl_no, CityUpdate cityUpdate) {
        City city1 = findByID(sl_no);

        city1.setCity_name(cityUpdate.getCity_name());
        city1.setMinimum_order(cityUpdate.getMinimum_order());
        city1.setTiming(cityUpdate.getTiming());
        city1.setService_on_off(cityUpdate.getService_on_off());
        city1.setDeliver_charge(cityUpdate.getDeliver_charge());
        city1.setReserve1(cityUpdate.getReserve1());
        city1.setReserve2(cityUpdate.getReserve2());
        cityRepository.save(city1);
    }

}
