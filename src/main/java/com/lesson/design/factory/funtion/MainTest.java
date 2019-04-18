package com.lesson.design.factory.funtion;

/**
 * @author henry
 */
public class MainTest {

    public static void main(String[] args) {
        // 工厂方法
        IFactoryFunction factoryCar1 = new FactoryCar1();
        IFactoryFunction factoryCar2 = new FactoryCar2();
        IFactoryFunction factoryCar3 = new FactoryCar3();
        ((Car1)factoryCar1.getCar()).makeCar();
        ((Car2)factoryCar2.getCar()).makeCar();
        ((Car3)factoryCar3.getCar()).makeCar();
    }

}
