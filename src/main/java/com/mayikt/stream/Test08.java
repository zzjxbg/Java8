package com.mayikt.stream;

import com.mayikt.entity.UserEntity;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test08 {
    public static void main(String[] args) {
        ArrayList<UserEntity> userEntities = new ArrayList<>();
        userEntities.add(new UserEntity("mayikt",20));
        userEntities.add(new UserEntity("meite",28));
        userEntities.add(new UserEntity("zhangsan",35));
        userEntities.add(new UserEntity("xiaowei",16));
        userEntities.add(new UserEntity("mayikt_list",109));
        userEntities.add(new UserEntity("mayikt_zhangsan",110));
        userEntities.add(new UserEntity("lisi",109));
        userEntities.add(new UserEntity("mayikt",66));
        userEntities.add(new UserEntity("mayikt",78));
        userEntities.add(new UserEntity("mayikt",32));
        //要求:对数据流的数据实现降序排列、且名称包含mayikt获取后两位
        Stream<UserEntity> stream = userEntities.stream();
        stream.sorted((o1,o2)->o1.getAge() - o2.getAge()).filter((userEntity) -> "mayikt".equals(userEntity.getUserName())).skip(2).limit(2)
                .forEach(userEntity -> System.out.println(userEntity));  //forEach是终止函数必须放最后
    }
}
