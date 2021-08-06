package com.mayikt.stream;

import com.mayikt.entity.UserEntity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Test06 {
    public static void main(String[] args) {
        ArrayList<UserEntity> userEntities = new ArrayList<UserEntity>();
        userEntities.add(new UserEntity("mayikt",20));
        userEntities.add(new UserEntity("meite",28));
        userEntities.add(new UserEntity("zhangsan",35));
        Stream<UserEntity> stream = userEntities.stream();
        stream.sorted(new Comparator<UserEntity>() {
            @Override
            public int compare(UserEntity o1, UserEntity o2) {
                return o2.getAge() - o1.getAge(); //从大到小排
            }
        }).forEach(userEntity -> System.out.println(userEntity));
    }
}
