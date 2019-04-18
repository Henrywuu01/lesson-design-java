package com.lesson.design.agent;

/**
 * 【代理类】【静态代理】
 *
 * 调用购票核心逻辑，并进行扩展
 * 优点：拓展性强：在不改变目标类的前提下进行功能扩展；
 * 确定：可维护性低：目标类、代理类都需要实现相同的接口，接口变动时需要改动的比较多。
 * 限制：目标类、代理类都要实现接口。
 * @author henry
 */
public class Proxy1 implements IOperate {

    private Ticket ticket;


    public Proxy1() {}

    public Proxy1(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void bought() {
        System.out.println("line up for tickets ...");

        if (null == ticket) {
            ticket = new Ticket();
        }
        ticket.bought();

        System.out.println("pay for proxy service ...");
    }
}
