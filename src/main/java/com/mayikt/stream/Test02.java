package com.mayikt.stream;

import com.mayikt.entity.UserEntity;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<UserEntity> userEntities = new ArrayList<UserEntity>();
        userEntities.add(new UserEntity("mayikt",20));
        userEntities.add(new UserEntity("meite",28));
        userEntities.add(new UserEntity("zhangsan",35));
    //list集合只有元素值key,list转换成map集合的情况下 指定key--user对象的username属性 value user对象
        /**
         * map<String(userName),UserEntity>
         */
        Stream<UserEntity> stream = userEntities.stream();
        /**
         * new Function<UserEntity, String(key)>
         */
        //new Function<UserEntity, String>():传入第一个参数为list中元素类型,第二个为map的key或value的类型
        Map<String, UserEntity> collect = stream.collect(Collectors.toMap(new Function<UserEntity, String>() {
            //map的key
            @Override
            public String apply(UserEntity userEntity) {
                return userEntity.getUserName();
            }
        }, new Function<UserEntity, UserEntity>() {
            //map的value
            @Override
            public UserEntity apply(UserEntity userEntity) {
                return userEntity;
            }
        }));
        collect.forEach(new BiConsumer(){
            @Override
            public void accept(Object o, Object o2) {
                System.out.println(o + "," + o2);
            }
         });
    }

        //使用lambda表达式就两行...
//        Map<String, UserEntity> collect = stream.collect(Collectors.toMap(userEntity -> userEntity.getUserName(), userEntity -> userEntity));
//        collect.forEach((BiConsumer) (o, o2) -> System.out.println(o + "," + o2));
//      }
}
