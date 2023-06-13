/**
 * Mariama Miranda
 * 6/10/2023
 * First Challenge
 */

package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static List<String[]> customerData = Arrays.asList(
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"},
            new String[] {"2","Daily Planet","-7500","01-10-2022"},
            new String[] {"1","Wayne Enterprises","18000","12-22-2021"},
            new String[] {"3","Ace Chemical","-48000","01-10-2022"},
            new String[] {"3","Ace Chemical","-95000","12-15-2021"},
            new String[] {"1","Wayne Enterprises","175000","01-01-2022"},
            new String[] {"1","Wayne Enterprises","-35000","12-09-2021"},
            new String[] {"1","Wayne Enterprises","-64000","01-17-2022"},
            new String[] {"3","Ace Chemical","70000","12-29-2022"},
            new String[] {"2","Daily Planet","56000","12-13-2022"},
            new String[] {"2","Daily Planet","-33000","01-07-2022"},
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"},
            new String[] {"2","Daily Planet","33000","01-17-2022"},
            new String[] {"3","Ace Chemical","140000","01-25-2022"},
            new String[] {"2","Daily Planet","5000","12-12-2022"},
            new String[] {"3","Ace Chemical","-82000","01-03-2022"},
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"}
    );

    public static void main(String[] args) {
        //initializes the three customers
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();
        for (String[] customer: customerData){

            if (Integer.parseInt(customer[0]) == (1)){ // Wayne Enterprises
                AccountRecord customerRecord1 = new AccountRecord(); // sets up each record
                customer1.setId(Integer.parseInt(customer[0])); // sets the ID
                customer1.setName(customer[1]); // sets the name
                customerRecord1.setCharge(Integer.parseInt(customer[2])); // sets the charges
                customerRecord1.setChargeDate(customer[3]); // sets the date
                customer1.getCharges().add(customerRecord1); // adds each record to the charges array
            }
            else if (Integer.parseInt(customer[0]) == (2)){ // Daily Planet
                AccountRecord customerRecord2 = new AccountRecord();
                customer2.setId(Integer.parseInt(customer[0]));
                customer2.setName(customer[1]);
                customerRecord2.setCharge(Integer.parseInt(customer[2]));
                customerRecord2.setChargeDate(customer[3]);
                customer2.getCharges().add(customerRecord2);
            }
            else if (Integer.parseInt(customer[0]) == (3)){ // Ace Chemical
                AccountRecord customerRecord3 = new AccountRecord();
                customer3.setId(Integer.parseInt(customer[0]));
                customer3.setName(customer[1]);
                customerRecord3.setCharge(Integer.parseInt(customer[2]));
                customerRecord3.setChargeDate(customer[3]);
                customer3.getCharges().add(customerRecord3);
            }
        }
        System.out.println("Positive accounts:");
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println("Negative accounts:");
        System.out.println(customer3.toString());
    }
}
