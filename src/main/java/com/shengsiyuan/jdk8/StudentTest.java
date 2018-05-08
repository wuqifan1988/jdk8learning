package com.shengsiyuan.jdk8;

import java.util.function.Supplier;

/**
 * @author huaishi
 */
public class StudentTest {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> new Student();
        System.out.println(studentSupplier.get().getName());

        System.out.println("----------------");

        Supplier<Student> studentSupplier2 = Student::new;
        System.out.println(studentSupplier2.get().getName());
    }
}
