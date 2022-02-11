package com.kirani.kiranibackendcode.repository;

import com.kirani.kiranibackendcode.entity.Config;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigRepository extends CrudRepository<Config,Long> {
}
