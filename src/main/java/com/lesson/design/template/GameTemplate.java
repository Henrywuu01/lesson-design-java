package com.lesson.design.template;

/**
 * 模版类
 *
 * @author henry
 */
abstract class GameTemplate {

    public abstract Object s1();
    public abstract Object s2();
    public abstract Object s3();

    /**
     * 确定执行步骤
     */
    public final void play() {
        s1();
        s2();
        s3();
    }

}
