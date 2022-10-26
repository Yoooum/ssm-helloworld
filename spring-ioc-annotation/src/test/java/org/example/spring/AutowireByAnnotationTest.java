package org.example.spring;

import org.example.spring.controller.UserController;
import org.example.spring.dao.UserDao;
import org.example.spring.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 未確認の庭師
 */
public class AutowireByAnnotationTest {
    /**
     * 注解:
     * Component: 将类标识为普通组件。
     * Controller: 将类标识为控制层组件。
     * Service: 将类标识为业务层组件。
     * Repository: 将类标识为持久层组件。
     * 通过注解和扫描所配置的bean的id默认为类的小驼峰。
     * 可以通过注解设置自定义id
     * ---
     * Autowired注解原理：
     * 1.默认通过byType的方式，在IOC容器中通过类型匹配某个bean为属性赋值。
     * 2.若有多个类型匹配的bean会自动转换为byName的方式实现自动装配的效果，
     *   即：将要赋值的属性的属性名作为bean的id匹配某个bean为属性赋值。
     * 3.若byType和byName都不能自动装配，即：IOC容器中有多个类型匹配的bean，且id和要赋值的属性的属性名都不一致，
     *   会抛bean不唯一的异常，这时可以添加例如Qualifier("xxxImpl")注解来指定某个bean的id，为属性赋值
     */
    @Test
    void autowire(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean(UserController.class);
        System.out.println(userController);
        UserService userService = ioc.getBean(UserService.class);
        System.out.println(userService);
        UserDao userDao = ioc.getBean(UserDao.class);
        System.out.println(userDao);

        userController.saveUser();
    }
}
