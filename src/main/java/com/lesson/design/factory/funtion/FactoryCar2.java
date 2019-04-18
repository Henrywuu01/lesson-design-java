package com.lesson.design.factory.funtion;

/**
 * 【工厂模式】【工厂方法】
 *  一个工厂只能生成一种产品，产品2的工厂
 *
 * @author henry
 */
public class FactoryCar2 implements IFactoryFunction {

    @Override
    public Object getCar() {
        return new Car2();
    }
}
