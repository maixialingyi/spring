package com.mashibing.t2_prepareRefresh;

import com.mashibing.MyBeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public MyClassPathXmlApplicationContext(String... configLocations){
        super(configLocations);
    }

    /**
     * 扩展 初始化属性
     */
    @Override
    protected void initPropertySources() {
        System.out.println("扩展initPropertySource");
        //配置系统必校验参数 : 如果未配置 throw MissingRequiredPropertiesException
        //getEnvironment().setRequiredProperties("xxx");
    }

    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        //todo 扩展性
        //是否允许覆盖同名称的不同定义的对象  <lookup-method>   <replaced-method>
        //super.setAllowBeanDefinitionOverriding(true);

        //是否允许bean之间存在循环依赖
        //super.setAllowCircularReferences(true);

        //添加自定义BeanFactoryPostProcessor  也可以配置bean 被扫描处理
        super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());

        //此处为重写,如需执行父类此方法 需调用AbstractRefreshableApplicationContext # customizeBeanFactory
        super.customizeBeanFactory(beanFactory);
    }

    @Override
    protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
        System.out.println("扩展实现postProcessBeanFactory方法");
    }
}
