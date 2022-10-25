package org.example.spring.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author 未確認の庭師
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //在bean的生命周期初始化之前执行
        System.out.println("后置处理器: postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //在bean的生命周期初始化之后执行
        System.out.println("后置处理器: postProcessAfterInitialization");
        return bean;
    }
}
