package com.kirani.kiranibackendcode.service;

import com.kirani.kiranibackendcode.entity.Config;
import com.kirani.kiranibackendcode.entity.Coupons;
import com.kirani.kiranibackendcode.repository.ConfigRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
