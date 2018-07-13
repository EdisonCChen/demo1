package com.example.demo;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class CORSConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public  void  addCorsMappings(CorsRegistry registry){
        registry
                .addMapping("/**")
                .allowedMethods("*")
                .allowedOrigins("*")
                .allowedHeaders("*");
    }
}
