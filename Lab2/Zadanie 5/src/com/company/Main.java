package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean rozwiazanie = false;
        int proba=1;
        Random rand = new Random();
        int liczba = rand.nextInt(15);

        while(rozwiazanie==false)
        {
            System.out.print("Wprowadź liczbę z zakresu 1-15: ");
            int zgadnij = Integer.parseInt(reader.readLine());
            if(zgadnij==liczba)
            {
                System.out.println("Znalazłeś szukaną liczbę!!!");
                rozwiazanie=true;
            }
            else if (zgadnij>liczba)
            {
                System.out.println("Podałeś większą liczbę.");
                rozwiazanie=false;
                proba++;
            }
            else if (zgadnij<liczba)
            {
                System.out.println("Podałeś mniejszą liczbę.");
                rozwiazanie=false;
                proba++;
            }
        }
        System.out.println("Zgadłeś za "+proba+" razem.");

    }
}
