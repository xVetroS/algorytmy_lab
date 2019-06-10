package com.company;

import java.io.Console;
import java.util.List;
import java.util.Scanner;

public class Osoby {

    public  String firstName;
    public  String lastName;
    public  int age;


    public Osoby(String ffName, String llName, int aage)
    {

        firstName = ffName;
        lastName = llName;
        age = aage;

    }

    public static void Pop(List<Osoby> ListaOsob)
    {
        Boolean pusty = ListaOsob.size() == 0;
        if (ListaOsob.size() == 0)
            System.out.println("--kolejka jest pusta--");
        else
            ListaOsob.remove(0);
    }
    public static void Push(List<Osoby> ListaOsob)
    {
        Scanner wprowadz = new Scanner(System.in);
        System.out.println("Podaj imie:: ");
        String firstname = wprowadz.nextLine();
        System.out.println("Podaj nazwisko: ");
        String lastname = wprowadz.nextLine();
        System.out.println("Podaj wiek: ");
        int age = wprowadz.nextInt();

        ListaOsob.add(new Osoby(firstname, lastname, age));
    }

    public static void pokazKolejke (List<Osoby> ListaOsob)
    {
        if (ListaOsob.size() == 0)
            System.out.println(("--kolejka jest pusta--"));
        else
        {
            for(Osoby osoby : ListaOsob)
            {
                System.out.println("Imię: " + osoby.firstName);
                System.out.println("Nazwisko: " + osoby.lastName);
                System.out.println("Wiek: " + osoby.age);

            }
        }

    }

}
