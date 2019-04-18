package com.lesson.design.agent;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 【代理类】【CGLIB代理】
 *
 * 调用购票核心逻辑，并进行扩展
 * 优点：高性能，限制较低。
 * 缺点：对于final方法，无法进行代理。
 * 限制：目标类不能是final（会报错），目标方法不能是final/static（不报错，但是不执行拓展方法）。
 *
 * @author henry
 */
public class Proxy3 implements MethodInterceptor{

    private Object target;


    public Proxy3() {}

    public Proxy3(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        //1. 工具类
        Enhancer en = new Enhancer();

        //2. 父类
        en.setSuperclass(target.getClass());

        //3. 回调函数
        en.setCallback(this);

        //4. 创建子类（代理类）
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("line up for tickets ...");
        Object res = method.invoke(target, objects);
        System.out.println("pay for proxy service ...");
        return res;
    }
}
