package com.mashibing.t5_invokeBeanFactoryPostProcessors;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component /** 在xml <context:component-scan标签 解析时会生成 beanDefinition*/
@Service
public class PersonService {
}
