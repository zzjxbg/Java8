package com.mayikt;

import com.mayikt.service.YouShenInterface;

/**
 * lambda带参数方法调用
 * (函数接口的参数列表 不需要写类型 需要定义参数名称)->{方法体}
 */
public class Test04 {
    public static void main(String[] args) {

        //1.使用匿名内部类调用
        YouShenInterface youShenInterface = new YouShenInterface() {
            @Override
            public String get(int i, int j) {
                return i + "--" + j;
            }
        };
        System.out.println(youShenInterface.get(1,2));

        //2.使用lambda表达式调用
        YouShenInterface youShenInterface1 = (i,j)->{
            return i + "--" + j;
        };
        System.out.println(youShenInterface1.get(1,2));
    }
}
