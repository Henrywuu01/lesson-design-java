package com.lesson.design.agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 【代理类】【动态代理】
 *
 * 调用购票核心逻辑，并进行扩展
 * 优点：不需要实现接口，利用Java的反射机制动态生成代理对象。
 * 缺点：目标类需要实现接口，代理类时对接口的代理。
 * 限制：目标类必须实现接口。
 *
 * @author henry
 */
public class Proxy2 {

    private Object target;


    public Proxy2() {}

    public Proxy2(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {

        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("line up for tickets ...");

                        Object res = method.invoke(target, args);

                        System.out.println("pay for proxy service ...");
                        return res;
                    }
                });
    }

}
