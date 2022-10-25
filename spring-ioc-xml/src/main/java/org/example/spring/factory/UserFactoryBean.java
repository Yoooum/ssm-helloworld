package org.example.spring.factory;

import org.example.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * FactoryBean<T>是一个接口,需要创建一个类实现该接口
 * getObject(): 通过一个对象交给IOC容器管理
 * getObjectType(): 设置所提供对象的类型
 * isSingleton(): 所提供的对象所否单例
 * 当把FactoryBean的实现类配置为bean时,会将当前类中getObject()所返回的对象交给IOC容器管理
 */
public class UserFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
