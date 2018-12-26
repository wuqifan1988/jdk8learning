package com.shengsiyuan.jdk8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author huaishi
 */
public class StreamTest4 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "hello world");

//        String[] stringArray = stream.toArray(String[]::new);
//        Arrays.asList(stringArray).forEach(System.out::print);

//        List<String> list = stream.collect(Collectors.toList());
//        list.forEach(System.out::println);

//        System.out.println(stream.map(String::toUpperCase).collect(Collectors.toList()));

//        List<String> list1 = stream.collect(ArrayList::new, (theList, item) -> theList.add(item.toUpperCase()), ArrayList::addAll);
        List<String> list2 = stream.collect(
                () -> new ArrayList(),
                (theList, item)-> theList.add(item),
                (theList1,theList2)-> theList1.addAll(theList2));

        list2.forEach(System.out::println);
    }
}
