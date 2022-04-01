package com.kirani.kiranibackendcode.service;

import com.kirani.kiranibackendcode.entity.Config;
import com.kirani.kiranibackendcode.entity.ConfigUpdate;
import com.kirani.kiranibackendcode.entity.Coupons;
import com.kirani.kiranibackendcode.repository.ConfigRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConfigService {
    private final ConfigRepository configRepository;

    public ConfigService(ConfigRepository configRepository) {
        this.configRepository = configRepository;
    }

    public void addConfig(Config config){
        this.configRepository.save(config);
    }

    public List<Config> getAllConfig(){
        return (List<Config>) this.configRepository.findAll();
    }

    public Config findById(Long sl_no) {
        Optional<Config> optionalConfig = configRepository.findById(sl_no);
        if(optionalConfig.isPresent()){
            return optionalConfig.get();
        }
        else{
            throw new RuntimeException();
        }
    }

    public void updateConfig(Long sl_no, ConfigUpdate configUpdate){
        Config config1 =findById(sl_no);

        config1.setMinimum_order(configUpdate.getMinimum_order());
        config1.setDelivery_time(configUpdate.getDelivery_time());
        config1.setDelivery_start(configUpdate.getDelivery_start());
        config1.setDelivery_end(configUpdate.getDelivery_end());
        config1.setOffers(configUpdate.getOffers());
        config1.setContact_no1(configUpdate.getContact_no1());
        config1.setContact_no2(configUpdate.getContact_no2());
        config1.setEmail(configUpdate.getEmail());
        config1.setOne_time_message(configUpdate.getOne_time_message());
        config1.setNotification(configUpdate.getNotification());
        config1.setShow_notification(configUpdate.getShow_notification());
        config1.setDelete_coupons(configUpdate.getDelete_coupons());
        config1.setDelete_images(configUpdate.getDelete_images());
        config1.setReserve_1(configUpdate.getReserve_1());
        config1.setReserve_2(configUpdate.getReserve_2());
        config1.setReserve_3(configUpdate.getReserve_3());
        configRepository.save(config1);
    }


}
