package com.mashibing.t5_invokeBeanFactoryPostProcessors.imports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 实现ImportSelector,重写方法selectImports,返回需要引入的类,并创建实例,加入spring容器
 */
public class MyImportSelector implements ImportSelector {
    public MyImportSelector() {
        System.out.println("MyImportSelector构造方法");
    }
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.mashibing.t5_invokeBeanFactoryPostProcessors.imports.Bimport"};
    }
}
