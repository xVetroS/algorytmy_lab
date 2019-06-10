package com.company;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static void MainMenu()
    {
        System.out.println("1 - Wstaw osobe do kolejki.");
        System.out.println("2 - Wyprowadz osobe z kolejki.");
        System.out.println("3 - Pokaz aktualny stan kolejki.");
        System.out.println("4 - Wyjscie z programu.");
    }

    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        Boolean koniec = true;
        List<Osoby> kolejka = new ArrayList<>();
        kolejka.add(new Osoby("Mateusz", "Jankowski", 20));
        kolejka.add(new Osoby("Tomasz", "Kowalski", 33));
        kolejka.add(new Osoby("Szymon", "Nadobny", 28));

        do
        {
            MainMenu();
            int zwraca = wprowadz.nextInt();
            switch (zwraca)
            {
                case 1:
                    Osoby.Push(kolejka);
                    break;
                case 2:
                    Osoby.Pop(kolejka);
                    break;
                case 3:
                    Osoby.pokazKolejke(kolejka);
                    break;
                case 4:
                    koniec = false;
                    break;
                default:
                    System.out.println("Nie ma takiej opcji do wyboru!");
                    break;
            }
        } while (koniec);
    }

    }
