package com.mashibing.t5_invokeBeanFactoryPostProcessors;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 在不影响xml基础上,通过后置处理器 完成注解方式 beanDefinition创建, 这就是可扩展性的好处
 *
 * 1) 自定义后置处理
 * 2) <context:component-scan  在xml读取时 ContextNamespaceHandler 创建ConfigurationClassPostProcessor beanDefiniton
 *    其继承了BeanDefinitionRegistryPostProcessor 即为一个后置处理器
 *    处理 @Configuration @Bean、@Component、@ComponentScan、@Import、@ImportResource @Order  @PropertySource 赋值 @Value 创建,注册beanDefiniton
 *
 *    自动装配 @Import 注解就是在后置处理器里处理的
 *    AnnotationConfigUtils
 */
public class TestPostProcessor {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("postProcessor.xml");
        MyPropertySource myPropertySource = (MyPropertySource) applicationContext.getBean("myPropertySource");
        System.out.println(myPropertySource.getName());
    }
}
