package org.example.spring.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 未確認の庭師
 */
class StudentTest {
    @Test
    void test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student student = (Student) ioc.getBean("Student_1");
        System.out.println(student);
    }

}