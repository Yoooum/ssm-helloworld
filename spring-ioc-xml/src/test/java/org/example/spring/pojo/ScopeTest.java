package org.example.spring.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 未確認の庭師
 */
public class ScopeTest {
    @Test
    void scope(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-scope.xml");
        Student s1 = ioc.getBean(Student.class);
        Student s2 = ioc.getBean(Student.class);
        // 默认单例模式
        System.out.println(s1 == s2);
    }
}
