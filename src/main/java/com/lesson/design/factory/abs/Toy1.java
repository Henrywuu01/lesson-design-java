package com.lesson.design.factory.abs;

/**
 *  产品-toy1
 *
 * @author henry
 */
public class Toy1 implements IToy{

    @Override
    public Object makeToy() {
        System.out.println("toy1");
        return "toy1";
    }
}
