package com.company;

import java.io.Console;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Waga {
    public static int liczba;
    public static int waga;

    public Waga(int liczba_a, int waga_a)
    {
        liczba = liczba_a;
        waga = waga_a;

    }

    public static void pokaz_kolejke(List<Waga> kolejka)
    {
        if (kolejka.size() == 0)
            System.out.println("Ta kolejka nie posiada elementów.");
        else
        {
            for (Waga waga : kolejka)
            {
                System.out.println("Liczba: " + waga.liczba);
                System.out.println("Priorytet: " + waga.waga);
            }
        }
    }
    public static void Push(List<Waga> kolejka)
    {
        int waga;
        int element;
        Scanner wprowadz = new Scanner(System.in);
        System.out.println("Wprowadz element: ");
        String a = wprowadz.nextLine();


        element = parseInt(a);
        System.out.println("Wprowadz priorytet: ");
        String b = wprowadz.nextLine();

        waga = parseInt(b);

        kolejka.add(new Waga(element, waga));
    }

    public static void Pop(List<Waga> kolejka)
    {
        Boolean pusty = kolejka.size() == 0;
        if (kolejka.size() == 0)
            System.out.print("--kolejka jest pusta--");
        else
            kolejka.remove(0);
    }
}
