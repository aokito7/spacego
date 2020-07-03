package com.aokito.spacego.usermanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.aokito.spacego.usermanage.mapper")
public class SpacegoUsermanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpacegoUsermanageApplication.class, args);
    }

}
