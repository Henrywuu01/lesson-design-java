package com.lesson.design.factory.funtion;

/**
 * 产品-car3
 *
 * @author henry
 */
public class Car3 implements ICar {

    @Override
    public Object makeCar() {
        System.out.println("car3");
        return "car3";
    }

}
