package com.mayikt.metthod;

import com.mayikt.service.MessageInterface2;

public class Test015 {
    public static void main(String[] args) {
        Test015 test015 = new Test015();
        MessageInterface2 messageInterface2 = ()->test015.objGet();
        System.out.println(messageInterface2.getMessage());

        //实例方法引入
        MessageInterface2 messageInterface3 = test015::objGet;
        System.out.println(messageInterface3.getMessage());
    }

    public String objGet() {
        return "实例方法引入";
    }
}
