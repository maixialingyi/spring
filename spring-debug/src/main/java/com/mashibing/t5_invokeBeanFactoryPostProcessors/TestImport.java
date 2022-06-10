package com.mashibing.t5_invokeBeanFactoryPostProcessors;

import com.mashibing.t5_invokeBeanFactoryPostProcessors.imports.Normal;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 参考MyImport
 */
public class TestImport {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("testImport.xml");
        Normal normal = (Normal) applicationContext.getBean("normal");

    }
}
