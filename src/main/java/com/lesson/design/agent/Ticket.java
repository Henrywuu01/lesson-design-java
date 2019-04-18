package com.lesson.design.agent;

/**
 * 【目标类】
 * 购票核心逻辑的实现
 *
 * @author henry
 */
public class Ticket implements IOperate {


    @Override
    public void bought() {
        System.out.println("I need one ticket.");
    }
}
