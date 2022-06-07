package com.mashibing.t3_obtainFreshBeanFactory.selftag;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyService {

    @Bean
    public String show(){
        return "msb";
    }
}
