package com.mayikt.service;

public interface OrderService {
    void get();
    /**
     * 如果需要使用到OrderService接口
     * 接口无法new,但可以通过匿名内部类new
     * 或者定义子类让父类接收
     */
}
