package com.mayikt.stream;

import com.mayikt.entity.UserEntity;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test15 {
    public static void main(String[] args) {
        ArrayList<UserEntity> userEntities = new ArrayList<UserEntity>();
        userEntities.add(new UserEntity("mayikt",20));
        userEntities.add(new UserEntity("meite",28));
        userEntities.add(new UserEntity("zhangsan",35));
        Stream<UserEntity> stream = userEntities.stream();
        //mysql limit(0,2) stream分页 (开始skip()跳过前面几个元素) 结束:limit
        stream.skip(1).limit(2).forEach(userEntity -> System.out.println(userEntity));
    }
}
