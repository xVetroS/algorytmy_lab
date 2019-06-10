package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.company.Waga.liczba;
import static com.company.Waga.waga;

public class Main {

    private static void MainMenu()
    {

        System.out.println("1 - Wprowadzenie elementu oraz jego priorytetu. ");
        System.out.println("2 - Zabierz element z kolejki.");
        System.out.println("3 - Pokaz wszystkie elementy.");
        System.out.println("4 - Wyjscie z programu.");
    }

    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        Boolean koniec = true;
        List<Waga> kolejka = new ArrayList<>();

        do {
            MainMenu();
            int menu = wprowadz.nextInt();
            switch (menu) {
                case 1:
                    Waga.Push(kolejka);
                    List<Integer> koncowa = kolejka.add(kolejka.set(liczba, waga));
                    break;
                case 2:
                    Waga.Pop(kolejka);
                    break;
                case 3:
                    Waga.pokaz_kolejke(kolejka);
                    break;
                case 4:
                    koniec = false;
                    break;
                default:
                    System.out.println("Nie ma takiej opcji!");
                    break;
            }
        } while (koniec);
    }
}
