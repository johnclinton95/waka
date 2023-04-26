package com.mboa.waka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration

public class ApplicationConfig  implements WebMvcConfigurer{

    @Bean
    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurer() {

    @Override
    public void addCorsMappings(CorsRegistry registry){
                    registry.addMapping("/product")
                            .allowedOrigins("http://localhost:6555")
                            .allowedMethods("GET", "POST", "PUT", "DELETE");
            }
        };
    }
}