package com.mashibing.t4_postProcessBeanFactory;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public MyClassPathXmlApplicationContext(String... configLocations){
        super(configLocations);
    }

    /** BeanFactoryPostProcessor 后置处理器前 扩展*/
    @Override
    protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
        // 直接设置自定义后置处理器
        super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
        System.out.println("扩展实现postProcessBeanFactory方法");
    }

    public static void main(String[] args) {
        new MyClassPathXmlApplicationContext("empty.xml");
    }
}
