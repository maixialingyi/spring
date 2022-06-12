package com.mashibing.factoryBean;

import com.mashibing.supplier.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 都是用来创建对象
 * BeanFactory按sping标准流程创建对象的工厂
 * FactoryBean 实现FactoryBean<自定义类>,由BeanFactory创建对象,此对象为工厂
 * 创建内部对象,单例存放再factoryBeanObjectCache中,多例时时创建
 */
public class TestFactoryBean {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("factoryBean.xml");
        //由spring管理  存入一级缓存
        MyFactoryBean myFactoryBean = (MyFactoryBean) ac.getBean( "&myFactoryBean");

        //FactoryBean # getObject(){} 中自定义创建的对象  factoryBeanObjectCache中
        User user = (User) ac.getBean("myFactoryBean");
        System.out.println(user);
    }
}
