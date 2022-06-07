package com.mashibing.t4_postProcessBeanFactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 自定义后置处理器
 * 可在 invokeBeanFactoryPostProcessors()前 设置 如: MyClassPathXmlApplicationContext
 * 也可以配置成bean,让程序通过类型获取
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("----------------MyBeanFactoryPostProcessor---------");
//        BeanDefinition dataSource = beanFactory.getBeanDefinition("dataSource");
//        Object username = dataSource.getPropertyValues().get("username");
//        if(username.equals("${jdbc.username}")){
//            username = "root";
//        }
    }
}
