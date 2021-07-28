package com.mayikt;

public class JDK8InterfaceImpl implements JDK8Interface{
    /**
     * 定义子类实现JDK8Interface 没有强制要求重写default和静态方法
     */
    @Override
    public void add() {
        System.out.println("add");
    }

}
