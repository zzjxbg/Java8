package com.mayikt.stream;

import com.mayikt.entity.UserEntity;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Test11 {
    public static void main(String[] args) {
//        Stream<Integer> integerStream = Stream.of(10,50,30,10);
//        Optional<Integer> reduce = integerStream.reduce(new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer a1, Integer a2) {
//                return a1 + a2;
//            }
//        });
//        System.out.println(reduce.get());

        ArrayList<UserEntity> userEntities = new ArrayList<UserEntity>();
        userEntities.add(new UserEntity("mayikt",20));
        userEntities.add(new UserEntity("meite",28));
        userEntities.add(new UserEntity("zhangsan",35));
        Stream<UserEntity> stream = userEntities.stream();
        Optional<UserEntity> sum = stream.reduce(new BinaryOperator<UserEntity>() {
            @Override
            public UserEntity apply(UserEntity user1, UserEntity user2) {
                UserEntity userEntity = new UserEntity("sum", user1.getAge() + user2.getAge());
                return userEntity;
            }
        });
        System.out.println(sum.get());


    }
}
