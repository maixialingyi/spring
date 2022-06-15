package com.mashibing.methodOverrides.lookup;

import com.mashibing.methodOverrides.lookup.FruitPlate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * lookup-method标签解决 : 单例模式的bean下引用一个原型模式的bean
 * 解决方式: cglib做动态代理,每次需要的时候都去创建最新的对象，而不会把原型对象缓存起来，
 */
public class TestMethodOverride {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("methodOverride.xml");
        /**
            <bean id="apple" class="com.mashibing.methodOverrides.lookup.Apple" >
            <property name="banana" ref="banana"></property>
            </bean>
            <bean id="banana" class="com.mashibing.methodOverrides.lookup.Banana" scope="prototype"></bean>
            此配置得出的banana 为单例的
         */
        /*Apple bean = ac.getBean(Apple.class);
        System.out.println(bean.getBanana());
        Apple bean2 = ac.getBean(Apple.class);
        System.out.println(bean2.getBanana());*/


        FruitPlate fruitplate1 = (FruitPlate) ac.getBean("fruitplate1");
        fruitplate1.getFruit();
        FruitPlate fruitplate2 = (FruitPlate) ac.getBean("fruitplate2");
        fruitplate2.getFruit();
    }
}
