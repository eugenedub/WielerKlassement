package com.dubgar;

import java.util.Scanner;

public class Menu {

    int createHoofdMenu() {
        System.out.println("Enter one of the following commands:");
        System.out.println("1 - Inlezen Bestanden");
        System.out.println("2 - Rapportage");
        System.out.println("3 - Afsluiten");
        Scanner scanChoice = new Scanner(System.in);
        System.out.println();

        int choiceentry = 0;
        try {
            do {
                System.out.println("Enter \"1\", \"2\" or \"3\"");

                choiceentry = scanChoice.nextInt();

                switch (choiceentry) {
                    case 1:
                        System.out.println("De keuze was 1");
                        System.out.println("Bestanden worden ingelezen");
                        break;
                    case 2:
                        System.out.println("De keuze was 2");
                        System.out.println("Rapportage wordt gemaakt");
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Choice must be a value between 1 and 3.");
                }
            }
            while (choiceentry > 3);
        } catch (Exception e) {
            System.out.printf("Keuze foutief dient numeriek te zijn : %s%n", e.getMessage());
        }
        return choiceentry;
    }

}
