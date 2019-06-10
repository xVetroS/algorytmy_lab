package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void MainMenu()
    {
        System.out.println("1 - Element na stos:");
        System.out.println("2 - Zdejmij element:");
        System.out.println("3 - Pokaz elementy:");
    }


    public static void main(String[] args) {
        Boolean koniec = true;
        List<Stos> stos = new ArrayList<>();
        Scanner wprowadz = new Scanner(System.in);
        do {
            MainMenu();
            int wybor = wprowadz.nextInt();
            switch (wybor)
            {
                case 1:
                    Stos.Push(stos);
                    break;
                case 2:
                    Stos.Pop(stos);
                    break;
                case 3:
                    Stos.showElements(stos);
                    break;
                case 4:
                    koniec = false; break;
                default:
                    System.out.println("Nie ma takiej opcji!");
                    break;
            }
        } while(koniec);

    }
}

