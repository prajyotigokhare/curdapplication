package com.urunov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootConfiguration
@SpringBootApplication
//@EnableSwagger2
@CrossOrigin
public class FullstackApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(FullstackApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // TODO Auto-generated method stub
        return builder.sources(FullstackApplication.class);
    }

}
