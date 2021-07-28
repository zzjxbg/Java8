package com.mayikt;

/**
 * jdk8之前,interface中定义变量和方法,变量必须是public static final,方法必须是public abstract的
 * jdk8开始,支持使用static和default修饰,可以写方法体,且不需要子类重写
 */
public interface JDK8Interface {
    /**
     * 接口中方法默认的修饰符为pubic abstract
     */
    void add();

    /**
     * jdk8提供默认的方法
     */
    default void defaultGet() {
        System.out.println("defaultGet");
    }

    static void staticDel() {
        System.out.println("staticDel");
    }
}
