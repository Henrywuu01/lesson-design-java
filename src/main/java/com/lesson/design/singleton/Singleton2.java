package com.lesson.design.singleton;

/**
 * 【单例】【懒汉式】
 *
 * 在需要的时候创建实例，如果实例已经存在，则返回之前创建的实例。
 * 优点：需要的时候才创建，减少资源浪费。
 * 缺点：需要考虑线程安全问题，加锁后会导致效率降低。
 *
 * @author henry
 */
public class Singleton2 {

    private static Singleton2 INSTANCE;

    private Singleton2(){}

    public static synchronized Singleton2 getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }

}
