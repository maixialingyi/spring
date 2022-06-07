package com.mashibing.t3_obtainFreshBeanFactory.selftag;

import com.mashibing.t3_obtainFreshBeanFactory.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSelfTag {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("selftag.xml");
        User user=(User)context.getBean("testbean");
        System.out.println("username:"+user.getUsername()+"  "+"email:"+user.getEmail());
    }
}
