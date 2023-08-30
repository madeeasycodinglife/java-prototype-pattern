package com.madeeasy;

public class Main {
    public static void main(String[] args) {
        Person original = new Person("Alice", 25);
        Person copy = original.clone();

        System.out.println("Original: " + original.getName() + ", " + original.getAge());
        System.out.println("Copy: " + copy.getName() + ", " + copy.getAge());

    }
}