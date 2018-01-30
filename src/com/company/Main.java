package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Costumer_interaction costumer = new Costumer_interaction();
        while (true) {
            costumer.Welcome();
            String GasType = input.nextLine();
            costumer.PrepayorPayafter();
            String PrepayorAfter = input.nextLine();
            if (GasType.equals("1") && PrepayorAfter.equals("1")) {
                costumer.RegularandPrepay(GasType);
                break;
            }else if (GasType.equals("1") && PrepayorAfter.equals("2")) {
                costumer.RegularandPayafter(GasType);
                break;
            }else if (GasType.equals("2") && PrepayorAfter.equals("1")) {
                costumer.midgradeandPrepay(GasType);
                break;
            }else if (GasType.equals("2") && PrepayorAfter.equals("2")) {
                costumer.midgradeandPayafter(GasType);
                break;
            }else if (GasType.equals("3") && PrepayorAfter.equals("1")) {
                costumer.premiumandPrepay(GasType);
                break;
            }else if (GasType.equals("3") && PrepayorAfter.equals("2")) {
                costumer.premiumandPayafter(GasType);
                break;
            } else {
                System.out.println("Sorry Invalid choice");
            }
        }

    }
}

