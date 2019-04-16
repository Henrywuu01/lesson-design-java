package com.lesson.design.singleton;

/**
 * 单例-双重检查（DCL）
 *
 *  优点：资源利用率高，第一次执行方法式单例才会被实例话。
 *  缺点：第一次加载时稍慢，jdk1.5之前可能会失败（无序性：执行顺序无法保证，可通过volatile解决）
 *
 * @author henry
 */
public class Singleton3 {

    private static Singleton3 INSTANCE;

    private Singleton3(){}

    public static Singleton3 getInstance() {
        if (null == INSTANCE) {
            synchronized (Singleton3.class) {
                if (null == INSTANCE) {
                    INSTANCE = new Singleton3();
                }
            }
        }
        return INSTANCE;
    }

}
