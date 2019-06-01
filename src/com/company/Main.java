package com.company;

public class Main {

    public static void main(String[] args) {
         Customer customer = new Customer("Tim", 54.94);
         Customer anotherCustomer;
         anotherCustomer = customer;
         anotherCustomer.setBalance(12.1);
        System.out.println("Balance " + customer.getName() + " is " + customer.getBalance());


    }
}
