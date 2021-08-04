package com.mayikt.stream;

import com.mayikt.entity.UserEntity;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<UserEntity> userEntities = new ArrayList<UserEntity>();
        userEntities.add(new UserEntity("mayikt",20));
        userEntities.add(new UserEntity("meite",28));
        userEntities.add(new UserEntity("zhangsan",35));
        /**
         * user对象属性值都是相等的,但是new两个对象,这两个对象的内存地址是不一样的,所以加入set无法去重
         */
//        UserEntity user = new UserEntity("xiaowei",16);
//        userEntities.add(user);
//        userEntities.add(user);
        userEntities.add(new UserEntity("xiaowei",16));
        userEntities.add(new UserEntity("xiaowei",16));
        userEntities.forEach(t-> System.out.println(t.toString()));
        System.out.println("取出重复");
        /**
         * 创建stream方式两种
         * 1.串行流stream()  单线程
         * 2.并行流parallelStream()  多线程
         * 并行流parallelStream比串行流stream效率要高
         */
        Stream<UserEntity> stream = userEntities.stream();
        //转换成set集合
        Set<UserEntity> setUserList = stream.collect(Collectors.toSet());
        setUserList.forEach(userEntity -> System.out.println(userEntity));
    }
}
