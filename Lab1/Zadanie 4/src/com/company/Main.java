package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b;
	System.out.println("Program liczacy n-ta potege liczby a: ");
        Scanner wprowadz = new Scanner(System.in);
        System.out.println("Wprowadz a: ");
        a = wprowadz.nextInt();
        System.out.println("Wprowadz b: ");
        b = wprowadz.nextInt();
        System.out.println("Wprowadzone wartosci to: " + a + " oraz " + b + ".");
        int rozwiazanie = 1;
        for(int i=0; i<b; i++)
        {
            rozwiazanie*=a;
        }

        System.out.println("Liczba: "+ a + " uniesiona do: " + b + " jest rowna " + rozwiazanie + ".");


    }
}
