package com.mayikt.stream;

import com.mayikt.entity.UserEntity;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test13 {
    public static void main(String[] args) {
        ArrayList<UserEntity> userEntities = new ArrayList<UserEntity>();
        userEntities.add(new UserEntity("mayikt",20));
        userEntities.add(new UserEntity("meite",28));
        userEntities.add(new UserEntity("zhangsan",35));
        Stream<UserEntity> stream = userEntities.stream();
        boolean b = stream.anyMatch(userEntity -> "mayikt".equals(userEntity.getUserName()));
        System.out.println(b);
    }
}
