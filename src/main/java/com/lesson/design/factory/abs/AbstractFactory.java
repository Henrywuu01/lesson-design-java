package com.lesson.design.factory.abs;

/**
 * 抽象工厂
 *
 * @author henry
 */
abstract class AbstractFactory {

    public abstract ICar getCar(String key);

    public abstract IToy getToy(String key);

}
