package com.lesson.design.factory.funtion;

/**
 * 产品-car1
 *
 * @author henry
 */
public class Car1 implements ICar {

    @Override
    public Object makeCar() {
        System.out.println("car1");
        return "car1";
    }

}
