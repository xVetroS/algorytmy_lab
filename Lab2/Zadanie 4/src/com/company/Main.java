package com.company;

import java.util.Scanner;

public class Main {

    public static double dodawanie(double a, double b)
    {
        return a+b;
    }
    public static double odejmowanie(double a, double b)
    {
        return a-b;
    }
    public static double mnozenie(double a, double b)
    {
        return a*b;
    }
    public static double dzielenie(double a, double b)
    {
        return a/b;
    }

    public static void main(String[] args) {
        int a, b;
        Scanner wprowadz = new Scanner(System.in);
        System.out.println("Podaj a: ");
        a = wprowadz.nextInt();
        System.out.println("Podaj b: ");
        b = wprowadz.nextInt();

        System.out.println("Wynik dodawania: " + Main.dodawanie(a,b));
        System.out.println("Wynik odejmowania: " +Main.odejmowanie(a,b));
        System.out.println("Wynik mnożenia: " +Main.mnozenie(a,b));
        if(b!=0)
        {
            System.out.println("Wynik dzielenia: " +Main.dzielenie(a,b));
        }
        else
        {
            System.out.println("Nie da sie dzielić przez zero!");
        }

    }
}
