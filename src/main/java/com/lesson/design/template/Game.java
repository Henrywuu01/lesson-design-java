package com.lesson.design.template;

/**
 * 模版实现
 *
 * @author henry
 */
public class Game extends TemplateGame {

    @Override
    public Object s1() {
        System.out.println("s1: init");
        return null;
    }

    @Override
    public Object s2() {
        System.out.println("s2: work");
        return null;
    }

    @Override
    public Object s3() {
        System.out.println("s3：distroy");
        return null;
    }
}
