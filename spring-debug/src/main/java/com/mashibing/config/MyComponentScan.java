package com.mashibing.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan("com.mashibing.t3_obtainFreshBeanFactory.selftag")
public class MyComponentScan {

    @ComponentScan("com.mashibing.t3_obtainFreshBeanFactory.selftag")
    @Configuration
    @Order(90)
    class InnerClass{

    }

}
