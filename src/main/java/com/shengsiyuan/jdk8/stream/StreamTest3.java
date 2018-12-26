package com.shengsiyuan.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

/**
 * @author huaishi
 */
public class StreamTest3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(list.stream().map(e -> e * 2).reduce(0, Integer::sum));
    }

}
