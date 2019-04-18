package com.lesson.design.singleton;

/**
 * 【单例】【静态内部类（饿汉式优化版）】
 *
 * 优点：利用类加载机制保证只创建一次实例，不存在多个线程创建多个实例的情况。在使用内部类的时候才创建，实现了延迟加载。
 * 缺点：
 *
 * @author henry
 */
public class Singleton4 {

    private Singleton4(){}

    public static class SingletonInstance {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
