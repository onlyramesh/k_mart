package com.kirani.kiranibackendcode.controller;

import com.kirani.kiranibackendcode.entity.Config;
import com.kirani.kiranibackendcode.service.ConfigService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("config")
public class ConfigController {

    private ConfigService configService;

    public ConfigController(ConfigService configService) {
        this.configService = configService;
    }

    @PostMapping
    public ResponseEntity<Void> saveConfig(@RequestBody Config config){
        this.configService.addConfig(config);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Config>> getAllCoupons() {
        List<Config> configList=this.configService.getAllConfig();
        return ResponseEntity.ok().body(configList);
    }
}
