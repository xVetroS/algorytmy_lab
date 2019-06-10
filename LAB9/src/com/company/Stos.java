package com.company;

import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Stos {
        public int s_id;
        public String s_name;
        public Stos(int Numer, String nazwa)
        {
            s_id = Numer;
            s_name = nazwa;
        }

    public static int identyfikator = 0;


    // Jest to metoda odpowiedzialna za nakładanie elementów na stos.
    public static void Push(List<Stos> stos) {
        Scanner wprowadz = new Scanner(System.in);

        System.out.println("Element: ");
        String element = wprowadz.nextLine();

        stos.add(new Stos(identyfikator, element));
        identyfikator++;

    }

    //Metoda zdejmująca element ze stosu.
    public static void Pop(List<Stos> stos) throws ArrayIndexOutOfBoundsException {
        Boolean isEmpty = stos.size() == 0;
        if (stos.size() == 0)
            System.out.println("Stos jest pusty!");
        else
            stos.remove((stos.size() - 1));
            identyfikator--;
    }

    public static void showElements(List<Stos> stos) {
        if (stos.size() == 0) {
            System.out.println("Stos jest pusty!");
        } else {
            for (Stos sth: stos) {
                System.out.println("Identyfikator: " + sth.s_id + " nazwa: " + sth.s_name);
            }
        }
    }
    }

