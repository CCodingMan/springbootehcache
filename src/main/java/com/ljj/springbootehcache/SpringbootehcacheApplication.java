package com.ljj.springbootehcache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan("com.ljj.springbootehcache.mapper")
public class SpringbootehcacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootehcacheApplication.class, args);
    }

}
