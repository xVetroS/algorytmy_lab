package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int rozmiar;
        double wynik1 = 0.0, wynik2 = 0.0;
        Scanner wprowadz = new Scanner(System.in);
        System.out.println("Podaj ilość ocen: ");
        rozmiar = wprowadz.nextInt();
        double ocena[] = new double[rozmiar];
        double razem[] = new double[rozmiar];
        double waga[] = new double[rozmiar];
    System.out.println("Wprowadź oceny z ich wagami: ");
    for(int i=0; i<ocena.length; i++)
    {
        System.out.println("Ocena: " + (i+1) + ".");
        ocena[i] = wprowadz.nextDouble();
        System.out.println("Waga dla oceny: " + (i+1) + ".");
        waga[i] = wprowadz.nextDouble();
        razem[i] = ocena[i] * waga[i];
    }
    System.out.println("Oceny wprowadzone do systemu wraz z wagami: ");
    for(int j=0; j<ocena.length; j++)
    {
        System.out.println("Ocena: " + ocena[j] + " waga: " + waga[j] + ".");
    }
    for(int x=0; x<ocena.length; x++)
    {
       wynik1 += razem[x];
       wynik2 += waga[x];
    }
        System.out.println("Srednia wazona podanych ocen wynosi: " + wynik1/wynik2 + ".");
    }
}
