package com.mayikt.stream;

import com.mayikt.entity.UserEntity;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test14 {
    public static void main(String[] args) {
        ArrayList<UserEntity> userEntities = new ArrayList<UserEntity>();
        userEntities.add(new UserEntity("mayikt",20));
        userEntities.add(new UserEntity("meite",28));
        userEntities.add(new UserEntity("zhangsan",35));
        Stream<UserEntity> stream = userEntities.stream();
        stream.filter(new Predicate<UserEntity>() {
            @Override
            public boolean test(UserEntity userEntity) {
                return "mayikt".equals(userEntity.getUserName()) && userEntity.getAge() > 18;
            }
        }).forEach((userEntity -> System.out.println(userEntity)));
        //lambda表达式形式
//        stream.filter(userEntity -> "mayikt".equals(userEntity.getUserName()) && userEntity.getAge() > 18).forEach((userEntity -> System.out.println(userEntity)));
    }
}
