package com.mayikt;

import com.mayikt.service.AcanthopanaxInterface;
import com.mayikt.service.YouShenInterface;

public class Test05 {
    public static void main(String[] args) {
        AcanthopanaxInterface acanthopanaxInterface = ()-> {
            System.out.println("我是方法");
        };
        acanthopanaxInterface.get();
        //精简代码
        ((AcanthopanaxInterface) ()-> {
            System.out.println("我是方法");
        }).get();

        //使用lambda 方法体中只有一条语句的情况下,这时不需要使用{},也可以不需要写return
        AcanthopanaxInterface acanthopanaxInterface1 = ()-> System.out.println("我是方法");
        ((AcanthopanaxInterface) ()-> System.out.println("我是方法")).get();

        YouShenInterface youShenInterface = (i,j)-> {
            return i + "-" + j;
        };
        YouShenInterface youShenInterface1 = (i,j)-> i + "-" + j;
        String s = ((YouShenInterface)(i,j)->i + "-" + j).get(1,2);
        System.out.println(s);
    }
}
