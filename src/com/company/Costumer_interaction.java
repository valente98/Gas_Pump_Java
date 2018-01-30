package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Costumer_interaction {
    Scanner input = new Scanner(System.in);
    public static void appendTransaction(String Gastype, String paytype, double gallons, double cash) throws IOException {
        FileWriter writer = new FileWriter("/home/basecamp/IdeaProjects/Java_Gas_pump/src/com/company/transaction_record.txt", true);
        writer.write("\n"+ Gastype + " | "+ paytype + "| Gallons: "+ gallons+ " | Price: "+cash);
        writer.close();
    }
    public static void inventory(String gastype, double Gallons) throws IOException {
        File file = new File("/home/basecamp/IdeaProjects/Java_Gas_pump/src/com/company/inventory.txt");
        Scanner input;
        input = new Scanner(file);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String next_line = input.nextLine();
            String final_line = input.nextLine();
            if (line.startsWith(gastype)){
                ArrayList myList = new ArrayList<String>(Arrays.asList(line.split(" ")));
                String amount = myList.get(1).toString();
                double total = Double.parseDouble(amount);
                double new_total= total -= Gallons;
                String new_ammount = Double.toString(new_total);
                line = line.replace(amount, new_ammount);
            } else if (next_line.startsWith(gastype)){
                ArrayList myList = new ArrayList<String>(Arrays.asList(next_line.split(" ")));
                String amount = myList.get(1).toString();
                double total = Double.parseDouble(amount);
                double new_total= total -= Gallons;
                String new_ammount = Double.toString(new_total);
                next_line = next_line.replace(amount, new_ammount);
            } else if (final_line.startsWith(gastype)){
                ArrayList myList = new ArrayList<String>(Arrays.asList(final_line.split(" ")));
                String amount = myList.get(1).toString();
                double total = Double.parseDouble(amount);
                double new_total= total -= Gallons;
                String new_ammount = Double.toString(new_total);
                final_line = final_line.replace(amount, new_ammount);
            }
            change_inventory(next_line, final_line, line);
        }
        input.close();
    }
    public static void change_inventory(String next_line, String final_line, String line) throws IOException {
        FileWriter writer = new FileWriter("/home/basecamp/IdeaProjects/Java_Gas_pump/src/com/company/inventory.txt");
        writer.write(line);
        writer.write("\n"+next_line);
        writer.write("\n"+final_line);
        writer.close();
    }
    public void Welcome() {
        System.out.println("Welcome to Shell!\n");
        System.out.println("Would you like...");
        System.out.println("\t[1] Regular  \n \t[2] Midgrade \n \t[3] Premium");
    }
    public void PrepayorPayafter() {
        System.out.println("would you like...");
        System.out.println("\t[1] Prepay \n\t[2] Pay After");
    }
    public void RegularandPrepay(String GasType) throws IOException {
        System.out.println("How much would you like to pay?");
        String price = input.nextLine();
        double amount= Double.parseDouble(price);
        Gas_type gas = new Gas_type(0, amount, GasType);
        double total = Math.round(gas.regular() * 100.0) / 100.0;
        System.out.println("Your total gallons is " + total);
        System.out.println("Thank you for fueling with Shell. \nHave a great day!");
        appendTransaction("regular", "Prepay", total, amount);
        inventory("Regular", total);
    }
    public void RegularandPayafter(String GasType) throws IOException {
        System.out.println("How many gallons would you like?");
        String gallons = input.nextLine();
        double amount= Double.parseDouble(gallons);
        Gas_type gas = new Gas_type(amount, 0, GasType);
        double total = Math.round(gas.regular() * 100.0) / 100.0;
        System.out.println("Your total price is $" + total);
        System.out.println("Thank you for fueling with Shell. \nHave a great day!");
        appendTransaction("regular", "Pay After", amount, total);
        inventory("Regular", amount);
    }
    public void midgradeandPrepay(String GasType) throws IOException {
        System.out.println("How much would you like to pay?");
        String price = input.nextLine();
        double amount= Double.parseDouble(price);
        Gas_type gas = new Gas_type(0, amount, GasType);
        double total = Math.round(gas.midgrade() * 100.0) / 100.0;
        System.out.println("Your total gallons is " + total);
        System.out.println("Thank you for fueling with Shell. \nHave a great day!");
        appendTransaction("Mid-grade", "Prepay", total, amount);
        inventory("Midgrade", total);
    }
    public void midgradeandPayafter(String GasType) throws IOException {
        System.out.println("How many gallons would you like?");
        String gallons = input.nextLine();
        double amount= Double.parseDouble(gallons);
        Gas_type gas = new Gas_type(amount, 0, GasType);
        double total = Math.round(gas.midgrade() * 100.0) / 100.0;
        System.out.println("Your total price is $" + total);
        System.out.println("Thank you for fueling with Shell. \nHave a great day!");
        appendTransaction("Mid-grade", "Pay After", amount, total);
        inventory("Midgrade", amount);
    }
    public void premiumandPrepay(String GasType) throws IOException {
        System.out.println("How much would you like to pay?");
        String price = input.nextLine();
        double amount= Double.parseDouble(price);
        Gas_type gas = new Gas_type(0, amount, GasType);
        double total = Math.round(gas.premium() * 100.0) / 100.0;
        System.out.println("Your total gallons is " + total);
        System.out.println("Thank you for fueling with Shell. \nHave a great day!");
        appendTransaction("Premium", "Prepay", total, amount);
        inventory("Premium", total);
    }
    public void premiumandPayafter(String GasType) throws IOException {
        System.out.println("How many gallons would you like?");
        String gallons = input.nextLine();
        double amount= Double.parseDouble(gallons);
        Gas_type gas = new Gas_type(amount, 0, GasType);
        double total = Math.round(gas.premium() * 100.0) / 100.0;
        System.out.println("Your total price is $" + total);
        System.out.println("Thank you for fueling with Shell. \nHave a great day!");
        appendTransaction("Mid-grade", "Pay After", amount, total);
        inventory("Premium", amount);
    }
}
