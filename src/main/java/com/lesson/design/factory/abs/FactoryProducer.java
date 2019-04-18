package com.lesson.design.factory.abs;

/**
 * 工厂生成器
 *
 * @author henry
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String key) {
        AbstractFactory factory = null;

        switch (key) {
            case "CAR":
                factory = new FactoryCar();
                break;
            case "TOY":
                factory = new FactoryToy();
                break;
            default:
                break;
        }

        return factory;
    }

}
