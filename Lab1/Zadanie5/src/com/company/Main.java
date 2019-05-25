package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Wpisz liczbę dla której program obliczy sumę cyfr:");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        int wynik = 0;
        if(x>1000) {
            while (x != 0) {
                wynik += x % 10;
                x /= 10;
            }
            System.out.println("Suma cyfr w podanej liczbie to : " + wynik);
        }
        else
        {
            System.out.println("Liczba musi byc wieksza niz 1000.");
        }
    }
}