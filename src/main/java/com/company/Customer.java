/**
 * Mariama Miranda
 * 6/10/2023
 * First Challenge
 */

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private List<AccountRecord> charges = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /***
     * This function adds up all charges and outputs the balance of the account
     * @return int balance
     */
    public int getBalance() {
        int balance = 0;
        for (AccountRecord charge : charges) {
            balance += charge.getCharge();
        }
        return balance;
    }

    public List<AccountRecord> getCharges() {
        return charges;
    }

    @Override
    public String toString() {
        return "Customer ID: " + id + "\nCustomer Name: " + name + "\nCustomer Balance: " + getBalance() + "\n\n";
    }
}
