package com.lesson.design.factory.abs;

/**
 *  产品-toy2
 *
 * @author henry
 */
public class Toy2 implements IToy{

    @Override
    public Object makeToy() {
        System.out.println("toy2");
        return "toy2";
    }
}
