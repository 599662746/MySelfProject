package com.lx.springbootmyself;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.lx.springbootmyself.mapper")
public class SpringbootmyselfApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootmyselfApplication.class, args);
    }

}
