package com.mashibing.t3_obtainFreshBeanFactory.selfEditor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 1.自定义编辑器  AddressPropertyEditor
 * 2.自定义注册器  AddressPropertyEditorRegistrar
 * 3.让spring可以识别注册器  AddressPropertyEditor 注入 CustomEditorConfigurer
 */
public class TestEditor {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("selfEditor.xml");
        Customer bean = ac.getBean(Customer.class);
        System.out.println(bean);
    }
}
