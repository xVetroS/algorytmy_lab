package com.company;

import java.util.Scanner;

import static com.company.CONVERT.*;

public class Main {

    public static void main(String[] args) {
        int liczba, wybor, typ_liczby;
        String liczba2;
        Scanner wprowadz = new Scanner(System.in);

            System.out.println("Podaj liczbe szesnastkowa do zamiany: ");
            liczba2 = wprowadz.nextLine();

            System.out.println("Podaj liczbe binarna/dziesietna: ");
            liczba = wprowadz.nextInt();


        System.out.println("Dokonaj wyboru: ");
        System.out.println("1) Dziesietny na binarny");
        System.out.println("2) Dziesietny na szesnastkowy");
        System.out.println("3) Binarny na dziesietny");
        System.out.println("4) Szesnastkowy na dziesietny");
        wybor = wprowadz.nextInt();
        switch(wybor)
        {
            case 1:
                System.out.println("Dziesietna: "+ liczba + " w systemie dwojkowym = " + zamiana_na_bin_szesnastkowy(liczba, 2)); break;
            case 2:
                System.out.println("Dziesietna: "+ liczba + " w systemie szesnastkowym = " + zamiana_na_bin_szesnastkowy(liczba, 16)); break;
            case 3:
                System.out.println("Binarny: " + liczba + " dziesietny: " + zamiana_z_binarnego_na_dziesietny(liczba)); break;
            case 4:
                System.out.println("Szesnastkowy: " + liczba2 + " dziesietny: " + zamiana_szesnastkowy_na_dziesietny(liczba2)); break;
        }

    }
}
