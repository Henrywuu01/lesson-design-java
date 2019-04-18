package com.lesson.design.factory.simple;

/**
 * 【工厂模式】【简单工厂】
 *  所有的产品通过一个工厂创建
 *  优点：能够根据外界给定的信息，决定究竟应该创建哪个具体类的对象。
 *  缺点：集中了所有实例的创建逻辑，不符合高内聚低耦合的设计思想。
 *
 * @author henry
 */
public class FactorySimple {

    public static ICar getCar(String key) {
        ICar car = null;

        switch (key) {
            case "CAR_1":
                car = new Car1();
                break;
            case "CAR_2":
                car = new Car2();
                break;
            case "CAR_3":
                car = new Car3();
                break;
            default:
                break;
        }

        return car;
    }

}
