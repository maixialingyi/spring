package com.mashibing.t5_invokeBeanFactoryPostProcessors;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 在不影响xml基础上,通过后置处理器 完成注解方式 beanDefinition创建, 这就是可扩展性的好处
 *
 * 1) 自定义后置处理 implement BeanDefinitionRegistryPostProcessor
 * 2) xml解析<context:component-scan 创建后置处理器 ConfigurationClassPostProcessor
 *    处理    @Configuration @Bean、@Component、@ComponentScan、
 *          @ImportResource @Order  @PropertySource 赋值 @Value 创建,注册beanDefiniton
 *          @Import 自动装配逻辑
 */
public class TestPostProcessor {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("postProcessor.xml");
        MyPropertySource myPropertySource = (MyPropertySource) applicationContext.getBean("myPropertySource");
        System.out.println(myPropertySource.getName());
    }
}
