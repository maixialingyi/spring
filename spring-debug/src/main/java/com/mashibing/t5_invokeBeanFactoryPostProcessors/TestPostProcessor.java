package com.mashibing.t5_invokeBeanFactoryPostProcessors;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPostProcessor {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("postProcessor.xml");
    }
}
