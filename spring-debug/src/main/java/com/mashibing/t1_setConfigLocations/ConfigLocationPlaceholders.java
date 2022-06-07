package com.mashibing.t1_setConfigLocations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 配置文件名称中占位符替换
 * Enviroment  中配置 spring.profiles.active=dev
 *
 * 源码: ClassPathXmlApplicationContext 145 setConfigLocations(configLocations);
 */
public class ConfigLocationPlaceholders {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("spring-${spring.profiles.active}.xml");
    }
}
