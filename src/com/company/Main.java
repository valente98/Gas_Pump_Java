package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Costumer_interaction costumer =  new Costumer_interaction();
        costumer.Welcome();
        String payment_choice = input.nextLine();
    }
}
