package com.mayikt.optional;

import com.mayikt.entity.OrderEntity;

import java.util.Optional;

public class Test22 {
    private static OrderEntity orderEntity;
    public static void main(String[] args) {
        System.out.println(Test22.getOrder());
        System.out.println(Test22.orderEntity);
    }

    public static OrderEntity getOrder() {
        //优化前
//        if(orderEntity == null) {
//            orderEntity = createOrder();
//        }
        /**
         * orElseGet()---写函数的接口的形式 赋默认值 可以接受Supplier的实现用来生成默认值
         * orElse()---直接传递默认值
         */
//        return Optional.ofNullable(orderEntity).orElse(createOrder());
        return Optional.ofNullable(orderEntity).orElseGet(Test22::orElseGet);  //静态方法引入
//        return orderEntity;
    }

    private static OrderEntity createOrder() {
        return new OrderEntity("123456", "mayikt");
    }

    public static OrderEntity orElseGet() {
        orderEntity = createOrder();
        return orderEntity;
    }


}
