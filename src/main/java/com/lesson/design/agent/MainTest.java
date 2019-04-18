package com.lesson.design.agent;


/**
 * @author henry
 *
 * 测试类
 */
public class MainTest {

    public static void main(String[] args) {
        // 1. 静态代理
        IOperate proxy1 = new Proxy1();
        proxy1.bought();

        // 2. 动态代理
        IOperate target = new Ticket();
        IOperate proxy2 = (IOperate) new Proxy2(target).getProxyInstance();
        proxy2.bought();

        // 3. cglib代理
        Ticket target3 = new Ticket();
        Ticket proxy3 = (Ticket) new Proxy3(target3).getProxyInstance();
        proxy3.bought();

    }

}
