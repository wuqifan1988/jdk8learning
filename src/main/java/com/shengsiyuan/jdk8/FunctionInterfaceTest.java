package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author huaishi
 */
public class FunctionInterfaceTest {

    public static void main(String[] args) {

        //consumer

        Consumer consumer = o -> System.out.println(o);
        Consumer after = o -> System.out.println("计数");
        Consumer result = consumer.andThen(after);


        List<String> list = Arrays.asList("1", "2", "3");
        list.forEach(result);

        //biConsumer
        BiConsumer<Integer, Integer> biConsumer = (i1, i2) -> System.out.println(i1+"+"+i2+"和为" + (i1 + i2));
        BiConsumer<Integer, Integer> biConsumer2 = (i1, i2) -> System.out.println(i1+"*"+i2+"积为" + i1 * i2);
        BiConsumer<Integer, Integer> biConsumerResult = biConsumer.andThen(biConsumer2);

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(3,4);
        map.forEach(biConsumerResult);


    }
}
