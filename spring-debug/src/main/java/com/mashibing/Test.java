package com.mashibing;

import com.mashibing.config.MyPropertySource;
import com.mashibing.cycle.A;
import com.mashibing.cycle.B;
import com.mashibing.selftag.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        //自定义扩展ClassPathXmlApplicationContext
        MyClassPathXmlApplicationContext ac = new MyClassPathXmlApplicationContext("factoryBean.xml");
        //获取 FactoryBean
        MyFactoryBean bean1 = (MyFactoryBean) ac.getBean( "&myFactoryBean");
        System.out.println(bean1);
        User bean = (User) ac.getBean("myFactoryBean");
        System.out.println(bean.getUsername());
        User bean2 = (User) ac.getBean("myFactoryBean");
        System.out.println(bean2.getUsername());

        /*MyClassPathXmlApplicationContext ac = new MyClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ac.getBean(MyPropertySource.class).getName());
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-${username}.xml");
        Person bean = ac.getBean(Person.class);
        System.out.println(bean);
        A bean1 = ac.getBean(A.class);
        System.out.println(bean1);
        ac.close();
        User user = (User) ac.getBean("msb");
        System.out.println(user.getUsername());*/

        /*MyClassPathXmlApplicationContext ac = new MyClassPathXmlApplicationContext("selfEditor.xml");
        Customer bean = ac.getBean(Customer.class);
        System.out.println(bean);
        ConversionService bean = ac.getBean(ConversionService.class);
        Student convert = bean.convert("1_zhangsan", Student.class);
        System.out.println(convert);

        MyClassPathXmlApplicationContext ac = new MyClassPathXmlApplicationContext("factoryMethod.xml");

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("test.xml");
        Person person = ac.getBean("person", Person.class);
        ac.close();
        Person person2 = ac.getBean("person", Person.class);

        ApplicationContext ac = new ClassPathXmlApplicationContext("person.xml");
        Person bean = ac.getBean(Person.class);
        Person bean2 = ac.getBean(Person.class);

        System.out.println(System.getProperties());
        System.out.println(System.getenv());

        ApplicationContext ac = new ClassPathXmlApplicationContext("public2.xml");
        Student bean = ac.getBean(Student.class);
        System.out.println(bean);

       //所有的对象必须只有一个，单例对象
        A a = new A();
        B b = new B();*/

    }
}
