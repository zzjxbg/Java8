package com.mayikt.optional;

import com.mayikt.entity.OrderEntity;

import java.util.Locale;
import java.util.Optional;

public class Test23 {
    public static void main(String[] args) {
        String orderName = Test23.getOrderName();
        System.out.println(orderName);
    }

    public static String getOrderName() {
        //优化前写法
        OrderEntity order = new OrderEntity("123456","mayikt");
//        if(order!=null) {
//            String orderName = order.getOrderName();
//            if(orderName!=null) {
//                return orderName.toLowerCase();
//            }
//        }
        //获取对象中 orderNameOptional
//        Optional<OrderEntity> orderOptional = Optional.ofNullable(order);
//        Optional<String> orderNameOptional = orderOptional.map(orderEntity -> orderEntity.getOrderName());
//        Optional<String> toLowerCase = orderNameOptional.map(name -> name.toLowerCase());
//        return toLowerCase.get();
        return Optional.ofNullable(order).map(orderEntity -> orderEntity.getOrderName()).map(orderName ->
                orderName.toLowerCase()).orElse(null);
    }
}
