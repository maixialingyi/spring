package com.mashibing;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public MyClassPathXmlApplicationContext(String... configLocations){
        super(configLocations);
    }

    @Override
    protected void initPropertySources() {
        System.out.println("扩展initPropertySource  添加需验证的系统参数  如果未配置 throw MissingRequiredPropertiesException");
        //getEnvironment().setRequiredProperties("xxx");
    }

    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        //是否允许覆盖同名称的不同定义的对象  <lookup-method>   <replaced-method>
        //super.setAllowBeanDefinitionOverriding(true);
        //是否允许bean之间存在循环依赖
        //super.setAllowCircularReferences(true);
        super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
        //此处为重写,如需执行父类此方法 需调用AbstractRefreshableApplicationContext # customizeBeanFactory
        super.customizeBeanFactory(beanFactory);
    }

    @Override
    protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
        System.out.println("扩展实现postProcessBeanFactory方法");
    }
}
