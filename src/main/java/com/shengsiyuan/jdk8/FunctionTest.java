package com.shengsiyuan.jdk8;

import java.util.Comparator;
import java.util.function.*;

/**
 * @author huaishi
 */
public class FunctionTest {
    public static void main(String[] args) {

//        Function<Integer, Integer> function1 = integer -> 2 * integer;
//
//        System.out.println("----------");
//
//        BooleanSupplier booleanSupplier = () -> true;
//        System.out.println(booleanSupplier.getAsBoolean());
//
//        System.out.println("----------");
//
//        BiConsumer<Integer, Integer> biConsumer = (a, b) -> {
//            System.out.println(a);
//            System.out.println(b);
//        };
//
//        BiConsumer<Integer, Integer> biConsumer2 = (a, b) -> {
//            System.out.println("111");
//            System.out.println("222");
//        };
//
//        biConsumer.andThen(biConsumer2).accept(2, 3);
//
//        System.out.println("----------");
//
//        BiFunction<Integer, Integer, Integer> biFunctionAdd = (a, b) -> a + b;
//        System.out.println(biFunctionAdd.apply(2, 3));
//
//        Function<Integer, Integer> functionSub = a -> a * a;
//        System.out.println(biFunctionAdd.andThen(functionSub).apply(2, 3));
//
//        System.out.println("----------");
//
//        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
//        System.out.println(binaryOperator.apply(2, 3));
//
//        Student student = new Student("zhangsan", 18);
//        Student student2 = new Student("lisi", 20);
//        Student student3 = new Student("wangwu", 22);
//        Student student4 = new Student("zhaoliu", 22);
//
//        Function<Student, Integer> function = Student::getAge;
//
//        System.out.println("----------");
//
////        System.out.println(BinaryOperator.minBy(Comparator.comparing(function).apply(student,student2));
//        Comparator<Student> comparator = Comparator.comparingInt(Student::getAge);
//
////        System.out.println(comparator.reversed().compare(student,student2));
//        System.out.println(comparator.thenComparing(Comparator.comparing(Student::getName)).compare(student3,student4));
//
//        System.out.println("----------");
//
//        String a = "z12";
//        String b = "a34";
//        System.out.println(a.compareTo(b));


        Student a = new Student("zhangsan", 3);
        Student b = new Student("zhangsan", 3);
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }


}
