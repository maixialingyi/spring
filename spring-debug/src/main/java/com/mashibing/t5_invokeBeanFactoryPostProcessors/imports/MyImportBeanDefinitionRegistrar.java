package com.mashibing.t5_invokeBeanFactoryPostProcessors.imports;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    public MyImportBeanDefinitionRegistrar() {
        System.out.println("执行MyImportBeanDefinitionRegistrar的构造方法");
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //指定要注册的bean信息
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Aimport.class);
        //注册bean,并指定bean的id
        registry.registerBeanDefinition("aimport", rootBeanDefinition);
    }
}
