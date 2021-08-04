package com.mayikt.stream;

import com.mayikt.entity.UserEntity;

import java.util.HashMap;
import java.util.HashSet;

public class Test09 {
    public static void main(String[] args) {
//        userEntities.add(new UserEntity("xiaowei",16));
//        userEntities.add(new UserEntity("xiaowei",16));
        //new 对象
        UserEntity user1 = new UserEntity("xiaowei",16);
        UserEntity user2 = new UserEntity("xiaowei",16);
        String str1 = "xiaowei";
        String str2 = "xiaowei";
        /**
         * 在默认的情况下equals方法比较两个对象的内存地址是否相等(Object中的equals)
         */
        System.out.println(user1.equals(user2));
        System.out.println(str1.equals(str2));
        /**
         * set集合底层依赖于map集合实现防重复key map集合底层基于equals结合hashcode比较防重复
         */
//        HashSet<String> strings = new HashSet<>();
//        strings.add();
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(user1,"a");
        objectObjectHashMap.put(user2,"b");
        objectObjectHashMap.forEach((k,v)-> System.out.println(k + "," + v));
    }
}
