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
     * Component: 将类标识为普通组件
     * Controller: 将类标识为控制层组件
     * Service: 将类标识为业务层组件
     * Repository: 将类标识为持久层组件
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
    }
}
