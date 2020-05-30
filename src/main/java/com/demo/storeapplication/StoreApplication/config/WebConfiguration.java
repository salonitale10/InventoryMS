package com.demo.storeapplication.StoreApplication.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
 

@Configuration
public class WebConfiguration implements WebMvcConfigurer{

	@Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        // Load file: validation.properties
        messageSource.setBasename("classpath:validation");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
	
}
