package com.shengsiyuan.jdk8;

import java.util.Optional;

/**
 * @author huaishi
 */
public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        optional.ifPresent(System.out::println);
        System.out.println("------");
        System.out.println(optional.orElse("world"));
        System.out.println(optional.orElseGet(() -> "你好"));

    }
}
