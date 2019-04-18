package com.lesson.design.factory.abs;

/**
 * 产品工厂
 *
 * @author henry
 */
public class FactoryCar extends AbstractFactory {

    @Override
    public ICar getCar(String key) {
        ICar car = null;

        switch (key) {
            case "CAR_1":
                car = new Car1();
                break;
            case "CAR_2":
                car = new Car2();
                break;
            default:
                break;
        }

        return car;
    }

    @Override
    public IToy getToy(String key) {
        return null;
    }
}
