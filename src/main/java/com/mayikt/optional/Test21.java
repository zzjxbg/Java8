package com.mayikt.optional;

import java.util.Optional;

public class Test21 {
    public static void main(String[] args) {
        String userName = "mayikt";
//        if (userName!=null) {
//
//        }
        Optional<String> optional = Optional.ofNullable(userName);
//        boolean present = optional.isPresent();
//        if(present) {
//            System.out.println(optional.get());
//        }
        //userName不为空的情况下,直接调用accept打印值 userName==null的情况下 就不会执行accept
//        optional.ifPresent(s-> System.out.println(s));
        optional.ifPresent(System.out::println);
    }
}
