package com.mayikt;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Test06 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("mayikt");
        strings.add("meite");
        strings.add("xiaowei");
        strings.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        strings.forEach(s-> {
            System.out.println(s);
        });
    }
}
