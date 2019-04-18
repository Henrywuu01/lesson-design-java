package com.lesson.design.factory.simple;

/**
 * 产品-car2
 *
 * @author henry
 */
public class Car2 implements ICar {

    @Override
    public Object makeCar() {
        System.out.println("car2");
        return "car2";
    }

}
