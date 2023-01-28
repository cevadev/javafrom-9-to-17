package com.ceva.java9.collection.api;

import java.util.List;

/**
 * Creando una lista inmodificable con las caracteristicas de java 9
 */
public class UnmodifiableList {
    public static void main(String[] args) {
        List<Employee> employeeList = List.of(); // empty list

        // list con un objeto
        List<Employee> eList = List.of(new Employee(101,"William Smith"));

        // lista con multiples objetos, puede aceptar hasta 10
        List<Employee> list = List.of(new Employee(102, "Andrew Smith"),
                new Employee(103, "Rakesh Ahuja"),
                new Employee(104, "David Monte"),
                new Employee(105, "Paul Allen"));

        System.out.println("Imprimiendo la lista vacia");
        employeeList.forEach((employee -> System.out.println(employee)));

        System.out.println("Imprimiendo la lista de 1 elemento");
        eList.forEach((employee -> System.out.println(employee)));

        System.out.println("Imprimiendo la lista de multiples elementos (hasta maximo 10)");
        list.forEach((employee -> System.out.println(employee)));

        employeeList.add(new Employee(111, "Cosme fulanito"));
    }
}
