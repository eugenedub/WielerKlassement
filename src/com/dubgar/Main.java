package com.dubgar;

public class Main {

    public static void main(String[] args) {
        int keuze;
        // write your code here
        Menu fietsKeuze = new Menu();
        keuze = fietsKeuze.createHoofdMenu();
        switch (keuze) {
            case 1:
                BestandLezer bl = new BestandLezer();
                System.out.println("Ja, de keuze was " + keuze);
                break;
            case 2:
                Rapportage rap = new Rapportage();
                System.out.println("Ja, de keuze was " + keuze);
                break;
            case 3:
                System.out.println("Programma wordt afgesloten: ");
                break;

            default:
                System.out.println("Er is iets fout gegaan");
        }
    }
}
