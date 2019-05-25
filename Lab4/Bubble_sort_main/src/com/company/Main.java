package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int rozmiar;
        Scanner wprowadz = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        rozmiar = wprowadz.nextInt();
        int[]tablica_liczbowa_bubble = new int[rozmiar]; // tablica o dwudziestu elementach.
        int[]tablica_liczbowa_insert = new int[rozmiar]; // tablica o dwudziestu elementach.
        System.out.println("Wprowadź liczby do tablicy(bubble_sort): [rozmiar tablicy] -  " + rozmiar + ".");
        for(int i=0; i < tablica_liczbowa_bubble.length; i++)
        {
            System.out.println("Liczba: " + (i+1) + ":");
            tablica_liczbowa_bubble[i] = wprowadz.nextInt();
        }
        System.out.println("Wprowadź liczby do tablicy(insert_sort): [rozmiar tablicy] -  " + rozmiar + ".");
        for(int i=0; i < tablica_liczbowa_insert.length; i++)
        {
            System.out.println("Liczba: " + (i+1) + ":");
            tablica_liczbowa_insert[i] = wprowadz.nextInt();
        }
        System.out.println("Tablica przed sortowaniem bubble sort: ");
        Main.wyswietl_tablice(tablica_liczbowa_bubble); // przed sortowaniem

        BubbleSort.sortowanie(tablica_liczbowa_bubble); //klasa BubbleSort, wykorzystanie metody wcześniej zaimplementowanej do sortowania i sortowanie naszej tablicy.
        System.out.println("Tablica po sortowaniu bubble sort: ");
        Main.wyswietl_tablice(tablica_liczbowa_bubble); // po sortowaniu

        System.out.println("Tablica przed sortowaniem insert sort: ");
        Main.wyswietl_tablice(tablica_liczbowa_insert); // przed sortowaniem

        InsertionSort.sortowanie(tablica_liczbowa_insert); //klasa BubbleSort, wykorzystanie metody wcześniej zaimplementowanej do sortowania i sortowanie naszej tablicy.
        System.out.println("Tablica po sortowaniu insert sort: ");
        Main.wyswietl_tablice(tablica_liczbowa_insert); // po sortowaniu

    }
    private static void wyswietl_tablice(int[]tablica) //metoda wyświetlająca elementy tablicy
    {
        for(int j=0; j < tablica.length; j++)
        {
            System.out.print(tablica[j] + " ");
        }
        System.out.println();

    }
}
