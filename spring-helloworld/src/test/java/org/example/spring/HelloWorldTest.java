package org.example.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 未確認の庭師
 */
class HelloWorldTest {

    @Test
    void sayHello() {
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取IOC容器中的bean
        HelloWorld helloWorld = (HelloWorld) ioc.getBean("HelloWorld");
        helloWorld.sayHello();
    }
}