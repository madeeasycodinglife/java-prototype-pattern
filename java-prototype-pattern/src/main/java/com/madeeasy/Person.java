package com.madeeasy;

public class Person implements Cloneable {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
