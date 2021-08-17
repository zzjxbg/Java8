package com.mayikt.optional;

import java.util.Optional;

public class Test019 {
    public static void main(String[] args) {
        String userName = null;
        /**
         * ofNullable 可以允许传递一个空值对象
         * of 不允许传递一个空值对象
         */
        Optional<String> optional = Optional.ofNullable(userName);
//        Optional.of(userName);
        boolean present = optional.isPresent();
        //返回false表示传入值为空,true表示非空
        System.out.println(present);
    }
}
