package org.example.spring.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 未確認の庭師
 */
class StudentTest {
    /**
     * 获取bean的3种方式。
     * 根据类型来获取bean时，在满足bean唯一的前提下，只要对象instanceof指定的类型返回true就认定类型匹配，就能获取到bean。
     * 通过bean的类型、bean所继承类的类型、bean所实现接口的类型都可以获取bean。
     */
    @Test
    void getBean(){
        // 获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");

        // 1： 根据bean的id获取bean
        Student s1 = (Student) ioc.getBean("student_1");
        System.out.println(s1);

        // 2：根据bean的类型获取bean（推荐,以后大多使用这个）
        //要求IOC容器中只能有一个类型匹配的bean，没有或有多个匹配的bean会抛异常
        Student s2 = ioc.getBean(Student.class);
        System.out.println(s2);

        // 3：根据bean的id和类型获取bean
        Student s3 = ioc.getBean("student_1",Student.class);
        System.out.println(s3);

        // 扩展：根据接口获取bean
        Person p1 = ioc.getBean(Student.class);
        System.out.println(p1);
        Person p2 = ioc.getBean(Person.class);
        System.out.println(p2);
    }

    /**
     * 依赖注入（DI）
     */
    @Test
    void dependencyInjection(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        // Setter注入
        Student s1 = ioc.getBean("student_2", Student.class);
        System.out.println(s1);
        // 构造器注入
        Student s2 = ioc.getBean("student_3", Student.class);
        System.out.println(s2);
        // 特殊字符处理和设置属性为null
        Student s3 = ioc.getBean("student_4", Student.class);
        System.out.println(s3);
        // 类类型赋值
        Student s4 = ioc.getBean("student_5", Student.class);
        System.out.println(s4);

        Clazz c1 = ioc.getBean("clazz_1", Clazz.class);
        System.out.println(c1);

        Clazz c2 = ioc.getBean("clazz_2", Clazz.class);
        System.out.println(c2);

        Student s6 = ioc.getBean("student_6", Student.class);
        System.out.println(s6);
    }

}