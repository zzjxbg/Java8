package com.mayikt.metthod;

import com.mayikt.service.MessageInterface;

public class Test012 {
    public static void main(String[] args) {
        //最原生匿名内部类调用方式
//        MessageInterface messageInterface = new MessageInterface() {
//            @Override
//            public void get(Integer a) {
//                System.out.println("geta:" + a);
//            }
//        };
//        messageInterface.get(1);

        //lambda表达式写法
//        MessageInterface messageInterface2 = (a)->{
//            System.out.println("geta:" + a);
//        };
//        messageInterface2.get(2);

        //lambda表达式方法体中直接引入方法
        MessageInterface messageInterface3 = (a) -> Test012.staticGet(a);
        //方法引入--实际上就是我们lambda表达式方法体中直接引入方法
        messageInterface3.get(2);

        //方法引入写法
        MessageInterface messageInterface4 = Test012::staticGet;
        messageInterface4.get(10);
        /**
         * Test012::staticGet为何能够等于(a) -> Test012.staticGet(a)
         * 必须遵循规范:引入的方法参数列表返回类型必须要和函数接口参数列表、返回类型保持一致
         */
    }

        public static void staticGet(Integer a) {
            System.out.println("staticGet,a:" + a);
        }

}
