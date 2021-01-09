package com.portfolio.demo.project.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    //외부 경로 리소스를 url로 불러올 수 있게함

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/summernoteImage/**") // summernoteImage
                .addResourceLocations("file:///C:/Users/Admin/IdeaProjects/webProject/summernoteImageFiles/"); // file:////C:/
    }
}
