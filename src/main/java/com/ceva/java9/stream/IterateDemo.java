package com.ceva.java9.stream;

import java.util.stream.Stream;

public class IterateDemo {
    public static void main(String[] args) {
        // iterate sin predicate: Java 8 version
        System.out.println("Java 8 style: iterate() without Predicate: =>");
        Stream.iterate(101, i -> i+1).limit(10)
                .forEach(number -> System.out.print(number + " " ));

        // iterate con predicate: Java 9 version
        System.out.println("\nJava 9 style: iterate() with Predicate: =>");
        Stream.iterate(101, i -> i <= 115, i -> i+1)
                .forEach(number -> System.out.print(number + " "));
    }
}
