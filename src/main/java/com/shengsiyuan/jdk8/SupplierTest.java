package com.shengsiyuan.jdk8;

import java.util.function.Supplier;

/**
 * @author huaishi
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello world";
        System.out.println(supplier.get());
    }
}
