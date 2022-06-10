package com.mashibing.t5_invokeBeanFactoryPostProcessors.imports;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 第一种: 普通类:
 * 如果Import的类型是普通类，则将其当作带有@Configuration的类一样处理
 * 将candidate构造为ConfigurationClass，标注为importedBy，意味着它是通过被@Import进来的
 * 后面处理会用到这个判断将这个普通类注册进DefaultListableBeanFactory
 *
 * 第二种: implements ImportSelector
 * 会反射生产对象     放入deferredImportSelectorHandler
 * ConfigurationClassParser 202 行  处理this.deferredImportSelectorHandler.process();
 *
 * 第三种: implements ImportBeanDefinitionRegistrar:
 * 放到当前configClass的importBeanDefinitionRegistrars中
 * 在ConfigurationClassPostProcessor处理configClass时会随之一起处理
 *
 *
 * springboot自动装配原理
 * 1. @SpringBootApplication @Import(AutoConfigurationImportSelector)
 * 2. 后置处理器ConfigurationClassPostProcessor执行解析注解 包含@Import的解析,即第二种方式解析
 * 3. AutoConfigurationImportSelector # getCandidateConfigurations 加载
 *    pring-boot-autoconfigure META-INF/spring.factories  EnableAutoConfiguration.class
 */
@Import({Normal.class,MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
@Configuration
public class MyImport {

}
