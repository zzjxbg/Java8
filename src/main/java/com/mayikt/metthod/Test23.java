package com.mayikt.metthod;

import com.mayikt.service.MayiktService;

import java.util.function.Function;

public class Test23 {
    public static void main(String[] args) {
        //1.使用匿名内部类的形式
        MayiktService mayiktService = new MayiktService() {
            @Override
            public String get(Test23 test23) {
                return test23.objGet();
            }
        };
        System.out.println(mayiktService.get(new Test23()));
        //2.lambda表达式写法
        MayiktService mayiktService1 = (test23)->test23.objGet();
        System.out.println(mayiktService1.get(new Test23()));

        //3.对象方法引入 这时函数接口第一个参数传递test23 返回调用test23.objGet方法
        MayiktService mayiktService2 = Test23::objGet;
        System.out.println(mayiktService2.get(new Test23()));
        //Test23::objGet;----(test23)->test23.objGet();
        //实例应用：获取字符串长度
        Function<String,Integer> strFunction = (str)->{
            return str.length();
        };
        Function<String,Integer> strFunction2 = String::length;
        System.out.println(strFunction2.apply("对象方法引入"));
    }

    public String objGet() {return "mayikt";}

}
