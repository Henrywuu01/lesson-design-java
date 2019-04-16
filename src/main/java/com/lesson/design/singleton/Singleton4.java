package com.lesson.design.singleton;

/**
 * 单例-静态内部类（饿汉式优化版）
 *
 * 优点：只在类加载的时候创建一次实例，不存在多个线程创建多个实例的情况，避免了多线程同比的问题。
 * 缺点：不需要的时候就加载了，造成资源浪费（内存、IO）。
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
