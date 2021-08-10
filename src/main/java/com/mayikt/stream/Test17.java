package com.mayikt.stream;

import java.time.Duration;
import java.time.Instant;
import java.util.OptionalLong;
import java.util.function.LongBinaryOperator;
import java.util.stream.LongStream;

public class Test17 {
    public static void main(String[] args) {
        Instant start = Instant.now();
        LongStream longStream = LongStream.rangeClosed(0,50000000000L);
        //使用并行流计算,五百亿求和耗费时间为:
        OptionalLong result = longStream.parallel().reduce(new LongBinaryOperator() {
            @Override
            public long applyAsLong(long left, long right) {
                return left + right;
            }
        });
        //使用多线程处理大的任务拆分成n多小任务 将计算结果合并 fork join 框架
        System.out.println(result.getAsLong());
        Instant end = Instant.now();
        System.out.println("五百亿求和耗费的时间为:" + Duration.between(start,end).toMillis());
    }
}
