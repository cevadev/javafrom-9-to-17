package com.ceva.java9.stream;

public class Customer implements Comparable<Customer>{
    private int customerId;
    private String customerName;
    private double customerBalance;

    public Customer(){}

    public Customer(int customerId, String customerName, double customerBalance) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerBalance = customerBalance;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(double customerBalance) {
        this.customerBalance = customerBalance;
    }

    @Override
    public int compareTo(Customer o) {
        return (this.customerBalance < o.customerBalance) ? -1 :
                (this.customerBalance > o.customerBalance ? 1 : 0);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerBalance=" + customerBalance +
                '}';
    }
}
