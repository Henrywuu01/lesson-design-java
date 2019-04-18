package com.lesson.design.factory.abs;

/**
 * 产品工厂
 *
 * @author henry
 */
public class FactoryToy extends AbstractFactory {

    @Override
    public ICar getCar(String key) {
        return null;
    }

    @Override
    public IToy getToy(String key) {
        IToy toy = null;

        switch (key) {
            case "TOY_1":
                toy = new Toy1();
                break;
            case "TOY_2":
                toy = new Toy2();
                break;
            default:
                break;
        }

        return toy;
    }
}
