package com.mashibing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 配置文件名称中占位符替换
 * Enviroment  中配置 spring.profiles.active=dev
 */
public class Test_01_MyPlaceholders {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-${spring.profiles.active}.xml");
    }
}
