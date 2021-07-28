package com.mayikt;

import com.mayikt.service.OrderService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Lambda好处:简化对匿名内部类的调用
 * lambda + 方法引入:代码变得更加精简
 */
public class Test02 {
    public static void main(String[] args) {
        // 1.new个子类让父类去接收
//        OrderService orderService = new OrderService() {
//            @Override
//            public void get() {
//                System.out.println("get");
//            }
//        };
//        orderService.get();

        // 2.使用匿名内部类的形式调用OrderService中get方法
//        new OrderService() {
//            @Override
//            public void get() {
//                System.out.println("get");
//            }
//        }.get();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+",run");
            }
        }).start();
    }
}
