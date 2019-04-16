package com.lesson.design.singleton;

/**
 * 单例-饿汉式
 *
 * 在类加载的时候创建实例，实例在整个程序周期都存在。
 * 优点：只在类加载的时候创建一次实例，不存在多个线程创建多个实例的情况，避免了多线程同比的问题。
 * 缺点：不需要的时候就加载了，造成资源浪费（内存、IO）。
 *
 * @author henry
 */
public class Singleton1 {

    private static Singleton1 INSTANCE = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance() {
        return INSTANCE;
    }

}
