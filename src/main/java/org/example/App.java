/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

class simpleInterest {

    public static void main(String args[])
    {
        System.out.print("Enter the principle: ");
        Scanner sc = new Scanner(System.in);
        double principle = sc.nextDouble();

        System.out.print("Enter the rate of exchange: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the number of years ");
        double time = sc.nextDouble();

        //amount = principle(1+rate*time)
        double amount = principle *(1+((rate/100)*time));

        //formatting output as money
        Locale usa = new Locale ("en", "US");
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
        System.out.print("After "+time+" years at "+rate+
                "%, the inverstment will be worth "+ dollarFormat.format(amount));


    }
}