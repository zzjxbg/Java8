package com.mayikt;

public class Test09 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("获取到线程名称"+Thread.currentThread().getName()+",子线程");
            }
        }).start();

        //lambda表达式实现线程调用
        new Thread(()-> System.out.println("获取到线程名称"+Thread.currentThread().getName() +",子线程"))
                .start();
    }
}
