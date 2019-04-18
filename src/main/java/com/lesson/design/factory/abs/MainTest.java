package com.lesson.design.factory.abs;

/**
 * @author henry
 */
public class MainTest {

    public static void main(String[] args) {
        // 抽象工厂
        AbstractFactory factoryCar = FactoryProducer.getFactory("CAR");
        ICar car1 = factoryCar.getCar("CAR_1");
        ICar car2 = factoryCar.getCar("CAR_2");
        car1.makeCar();
        car2.makeCar();

        AbstractFactory factoryToy = FactoryProducer.getFactory("TOY");
        IToy toy1 = factoryToy.getToy("TOY_1");
        IToy toy2 = factoryToy.getToy("TOY_2");
        toy1.makeToy();
        toy2.makeToy();
    }

}
