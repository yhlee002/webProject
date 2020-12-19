package com.portfolio.demo.project.config;

import com.portfolio.demo.project.controller.NaverLoginApiUtil;
import com.portfolio.demo.project.controller.NaverProfileApiUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NaverApiConfig {
    @Bean
    public NaverLoginApiUtil naverLoginApiUtil() {
        return new NaverLoginApiUtil();
    }
    @Bean
    public NaverProfileApiUtil naverProfileApi(){
        return new NaverProfileApiUtil();
    }
}
