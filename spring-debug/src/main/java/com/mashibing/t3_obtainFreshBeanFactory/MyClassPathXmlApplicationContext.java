package com.mashibing.t3_obtainFreshBeanFactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 解析<context:component-scan  如过打开注解
 * ComponentScanBeanDefinitionParser 中 AnnotationConfigUtils中后置处理器注册成beanDefinition
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public MyClassPathXmlApplicationContext(String... configLocations){
        super(configLocations);
    }

    /**
     * 设置相关属性，包括是否允许覆盖同名称的不同定义的对象以及循环依赖
     */
    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        //todo 扩展性
        //是否允许覆盖同名称的不同定义的对象  <lookup-method>   <replaced-method>
        //super.setAllowBeanDefinitionOverriding(true);

        //是否允许bean之间存在循环依赖
        //super.setAllowCircularReferences(true);

        //此处为重写,需执行父类此方法
        super.customizeBeanFactory(beanFactory);
    }

    public static void main(String[] args) {
        new MyClassPathXmlApplicationContext("empty.xml");
    }
}
