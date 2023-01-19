package com.ceva.java9.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * dropWhile() permite saltar elementos en el stream basados en una condicion
 */
public class DropWhileDemo {
    public static void main(String[] args) {
        List<Customer> customerList = Arrays.asList(
                new Customer(101, "Alex Kerry", 440),
                new Customer(102, "John Smith", 55),
                new Customer(103, "Alan Willis", 770),
                new Customer(104, "Mark Flex", 667));

        List<Customer> selectedCustomers = customerList.stream()
                .sorted()
                .dropWhile(customer -> customer.getCustomerBalance() < 500)
                .collect(Collectors.toList());

        Iterator<Customer> customerIterator = selectedCustomers.iterator();
        while (customerIterator.hasNext()){
            System.out.println(customerIterator.next());
        }
    }
}
