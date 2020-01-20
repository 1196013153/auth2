package com.yqs.basic;

import com.yqs.basic.entity.User;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: auth2
 * @description:
 * @author: yqs
 * @create: 2019-10-31 11:29
 */
public class Demo1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 7, 3, 5);
        Demo1 demo = new Demo1();
// 获取对应的平方数
        numbers.stream()
                .map(i -> i * i)
                .filter(i -> i>5)
                .sorted()
                .collect(Collectors.toList())
                .forEach(demo::add2);
    }

    void add2(int num) {
        System.out.println(num + 2);
    }
}