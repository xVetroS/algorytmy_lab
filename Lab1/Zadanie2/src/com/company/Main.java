package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wartosc a: ");
        a = in.nextInt();
        System.out.println("Podaj wartosc b: ");
        b = in.nextInt();
        System.out.println("Wprowadzone wartości to: " + a + " oraz " + b + ".");
        NWD n = new NWD(); // stworzenie obiektu NWD.
                System.out.println("Najwiekszy wspolny dzielnik to: " + n.greatestCommonDivisor(a,b) + "."); // Wywołanie metody NWD.
                System.out.println("Najmniejsza wspolna wielokrotnosc to: " + (a*b)/n.greatestCommonDivisor(a,b)); // Wyrzuca wynik NWW z użyciem metody NWD.
    }
}
