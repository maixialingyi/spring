package com.mashibing.factoryBean;

import com.mashibing.supplier.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("factoryBean.xml");
        //获取spring全流程中产生的 FactoryBean
        MyFactoryBean myFactoryBean = (MyFactoryBean) ac.getBean( "&myFactoryBean");

        //FactoryBean # getObject(){} 中自定义创建的对象
        User user = (User) ac.getBean("myFactoryBean");
        System.out.println(user);
    }
}
