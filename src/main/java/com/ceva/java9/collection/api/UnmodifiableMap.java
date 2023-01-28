package com.ceva.java9.collection.api;

import java.util.Map;

public class UnmodifiableMap {
    public static void main(String[] args) {
        Map<Integer, Employee> empMap = Map.of();

        // creamos Map con un elemento
        Map<Integer, Employee> empMap2 = Map.of(
                1, new Employee(101, "Mario Ortega")
        );

        // creamos Map con multiples objetos, puede aceptar hasta 10
        Map<Integer, Employee> employeeMap = Map.of(
                1, new Employee(101, "Mario Ortega"),
                2, new Employee(102, "Alan White"),
                3, new Employee(103, "Antonio Gonzalez")
        );

        System.out.println("Printing empty Map ==>");
        empMap.forEach((k,v)-> System.out.println("key= " + k + " value= " + v));

        System.out.println("Printing map of one element ==>");
        empMap2.forEach((k, v) -> System.out.println("key= " + k + " value= " + v));

        System.out.println("Printing map of multiple values (up to 10 elements) ==>");
        employeeMap.forEach((k,v) -> System.out.println("key= " + k + " value= " + v));
    }
}
