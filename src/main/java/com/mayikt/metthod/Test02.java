package com.mayikt.metthod;

import com.mayikt.entity.MessageEntity;
import com.mayikt.service.MessageInterface3;

public class Test02 {
    public static void main(String[] args) {
//        MessageInterface3 messageInterface3 = ()->{
//            return new MessageEntity();
//        };
        /**
         * 构造函数方法引入规范:函数接口返回类型::new
         */
        MessageInterface3 messageInterface3 = MessageEntity::new;
        System.out.println(messageInterface3.getMessage());

    }
}
