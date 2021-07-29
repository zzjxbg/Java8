package com.mayikt;

import com.mayikt.service.AcanthopanaxInterface;

/**
 * ()   参数列表
 * ->   分隔
 * {}   方法体
 * (a,b)->{}
 * 无参方法调用
 * 有参方法调用
 */
public class Test03 {
    public static void main(String[] args) {

        //1.使用匿名内部类调用
        new AcanthopanaxInterface() {
            @Override
            public void get() {
                System.out.println("get");
            }
        }.get();

        //2.使用lambda表达式调用
        AcanthopanaxInterface acanthopanaxInterface = ()->{
            System.out.println("使用lambda表达式调用方法");
        };
        acanthopanaxInterface.get();
    }
}
