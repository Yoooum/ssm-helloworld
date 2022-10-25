package org.example.spring.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 未確認の庭師
 */
public class LifeCycleTest {
    /**
     * bean 的生命周期
     * ConfigurableApplicationContext 是 ApplicationContext 的子接口,扩展了刷新和关闭方法
     * ---
     * 生命周期1: 实例化
     * 生命周期2: 依赖注入
     * 生命周期3: 初始化,需要指定 init-Method
     * User{id=1, username='admin', password='12345'}
     * 生命周期4: 销毁,需要指定 destroy-Method
     * ---
     * 单例模式会在获取IOC容器时创建对象(生命周期1-3)
     * 多例模式时,生命周期1-3会在获取bean时执行,并且销毁不由IOC容器管理
     * ---
     * bean的后置处理器会在生命周期前后添加额外的操作,需要实现BeanPostProcessor接口且配置到IOC容器
     */
    @Test
    void lifeCycle(){
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);
        ioc.close();
    }
}
