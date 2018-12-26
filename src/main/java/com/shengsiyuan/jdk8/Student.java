package com.shengsiyuan.jdk8;

/**
 * @author huaishi
 */
public class Student {
    private String name = "zhangsan";
    private int age = 20;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.getName() + ": " + this.getAge();
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student)obj;
        return this.getAge() == student.getAge() && this.getName().equals(student.getName());
    }
}
