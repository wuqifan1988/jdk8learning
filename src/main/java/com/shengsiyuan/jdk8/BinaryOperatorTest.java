package com.shengsiyuan.jdk8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @author huaishi
 */
public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (a, b) -> a + b;
        BinaryOperator<Integer> sub = (a, b) -> a - b;
        BinaryOperator<Integer> mul = (a, b) -> a * b;
        BinaryOperator<Integer> div = (a, b) -> a / b;

        BinaryOperatorTest binaryOperatorTest = new BinaryOperatorTest();

        System.out.println(binaryOperatorTest.compute(2, 4, add));
        System.out.println(binaryOperatorTest.compute(2, 4, sub));
        System.out.println(binaryOperatorTest.compute(2, 4, mul));
        System.out.println(binaryOperatorTest.compute(2, 4, div));

        System.out.println(binaryOperatorTest.minString("b","adad", Comparator.comparingInt(String::length)));
        System.out.println(binaryOperatorTest.minString("b","adad", (a,b) -> a.charAt(0) - b.charAt(0)));


    }

    public int compute(int a, int b, BinaryOperator<Integer> binaryOperator) {

        return binaryOperator.apply(a, b);
    }

    public String minString(String a, String b, Comparator<String> comparator) {

        return BinaryOperator.minBy(comparator).apply(a, b);
    }


}
