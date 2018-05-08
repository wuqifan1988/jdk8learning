package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.List;

/**
 * @author huaishi
 */
public class MethodReferenceDemo {

    public static void main(String[] args) {

        List<String > list = Arrays.asList("hello","world","hello world");
        list.forEach(ele -> {
            System.out.println(ele);
        });
    }

}
