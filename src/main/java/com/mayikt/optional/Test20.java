package com.mayikt.optional;

import java.util.Optional;

public class Test20 {
    public static void main(String[] args) {
        String userName = null;
        String userName2 = "mayikt";
        //Optional设定默认值
        String uName = Optional.ofNullable(userName).orElse("meite");
        System.out.println(uName);
        //Optional过滤
        Boolean f = Optional.ofNullable(userName2).filter(s -> "mayikt".equals(s)).isPresent();
        System.out.println(f);
    }
}
