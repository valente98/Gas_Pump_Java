package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Costumer_interaction costumer =  new Costumer_interaction();
        costumer.Welcome();
        String GasType = input.nextLine();
        costumer.PrepayorPayafter();
        String PrepayorAfter = input.nextLine();
        if(GasType.equals("1") || GasType.equals("2") || GasType.equals("3")){
            if(PrepayorAfter.equals("1")){
                System.out.println("How much would you like to pay?");
                String price = input.nextLine();
                double amount= Double.parseDouble(price);
                Gas_type gas = new Gas_type(0, amount, GasType);
                System.out.println("Your total gallons is " + gas);
                System.out.println("Thank you for fueling with Shell. \nHave a great day!");
            }else if(PrepayorAfter.equals("2")){
                System.out.println("How many gallons would you like?");
                String gallons = input.nextLine();
                double amount= Double.parseDouble(gallons);
                Gas_type gas = new Gas_type(amount, 0, GasType);
                System.out.println("Your total price is " + gas);
                System.out.println("Thank you for fueling with Shell. \nHave a great day!");
            }else {
                System.out.println("Sorry invalid choice.");
            }
        }else{
           System.out.println("Sorry Invalid choice");
        }
    }
}
