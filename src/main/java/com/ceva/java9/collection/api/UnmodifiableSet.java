package com.ceva.java9.collection.api;

import java.util.List;
import java.util.Set;

/**
 * Creando una lista inmodificable con las caracteristicas de java 9
 */
public class UnmodifiableSet {
    public static void main(String[] args) {
        Set<Employee> employeeSet= Set.of(); // empty list

        // list con un objeto
        Set<Employee> eSet = Set.of(new Employee(101,"William Smith"));

        // lista con multiples objetos, puede aceptar hasta 10
        Set<Employee> set = Set.of(new Employee(102, "Andrew Smith"),
                new Employee(103, "Rakesh Ahuja"),
                new Employee(104, "David Monte"),
                new Employee(105, "Paul Allen"));

        System.out.println("Imprimiendo la lista vacia");
        employeeSet.forEach((employee -> System.out.println(employee)));

        System.out.println("Imprimiendo la lista de 1 elemento");
        eSet.forEach((employee -> System.out.println(employee)));

        System.out.println("Imprimiendo la lista de multiples elementos (hasta maximo 10)");
        set.forEach((employee -> System.out.println(employee)));
    }
}
