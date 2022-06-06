package com.mashibing.selftag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class UserNamespaceHandler extends NamespaceHandlerSupport {
    /**
     * spring 标签处理逻辑
     * 1.加载spring.handlers配置文件
     * 2.将配置文件内容加载到map集合
     * 3.根据指定key去获取对应的处理器   spring.schemas  user.xsd
     *
     * 此处直接注册处理器
     */
    @Override
    public void init() {
        registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
    }
}
