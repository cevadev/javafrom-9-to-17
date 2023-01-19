package com.ceva.java9.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * takeWhile toma un predicado si este falla detiene la cadena de procesamiento del stream
 * Una vez que el productCategory no coincide con el valor buscado la operacion stream se detiene
 * takeWhile se usa para romper la iteracion de los elementos del stream aplicar condicionales o
 * break condicionales.
 * En la version 8 de Java se utilizaban los metodos limit() y filter()
 */
public class TakeWhileDemo {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product("Denim Jeans", "Garment", 1500.00),
                new Product("T Shirt", "Garment", 500.00),
                new Product("Nike", "Sport", 320.00),
                new Product("Kurtis", "Garment", 600.00)
        );

        productList.stream()
                .takeWhile(product -> product.getProductCategory().equals("Garment"))
                .forEach(System.out::println);
    }
}
