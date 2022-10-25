package org.example.spring;

import org.example.spring.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 未確認の庭師
 */
public class AutowireByXmlTest {
    /**
     * 自动装配:
     * 根据指定的策略在IOC容器中匹配某个bean,自动为bean中的类类型或接口类型的属性赋值.
     * <br><br>
     * 通过bean标签autowire属性设置策略
     * <br><br>
     * byType:
     * 若通过类型没有找到任何一个类型匹配的bean,此时不装配,属性使用默认值,
     * 若通过类型找到多个类型匹配的bean,将抛出异常.
     * 当使用byType实现自动装配时,IOC容器中有且只有一个类型匹配的bean能够作为属性赋值
     * <br><br>
     * byName:
     * 将要赋值的属性的属性名作为bean的id在IOC容器中匹配某个bean,为属性赋值.
     * 当类型匹配的bean有多个时,此时可使用byName实现自动装配
     */
    @Test
    void autowire(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();
    }
}
