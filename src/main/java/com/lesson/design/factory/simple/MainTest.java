package com.lesson.design.factory.simple;

/**
 * @author henry
 */
public class MainTest {

    public static void main(String[] args) {
        // 简单工厂
        Car1 car1 = (Car1) FactorySimple.getCar("CAR_1");
        Car2 car2 = (Car2) FactorySimple.getCar("CAR_2");
        Car3 car3 = (Car3) FactorySimple.getCar("CAR_3");

        car1.makeCar();
        car2.makeCar();
        car3.makeCar();
    }

}
