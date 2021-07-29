package com.mayikt.service;

/**
 * 函数接口定义
 * 1.在接口中只能有一个抽象方法
 * 2.@FunctionalInterface 标记该接口为函数接口
 * 3.可以通过default修饰为普通方法
 * 4.可以定义Object类中的方法
 */
public interface MyFunctionalInterface {
    void get();

    default void defaultAdd() {
        System.out.println("我是默认的方法");
    }

    /**
     * Object父类中的方法可以在函数接口中重写
     */
    String toString();
}
