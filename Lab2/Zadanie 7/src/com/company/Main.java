package com.company;

import java.util.Scanner;

public class Main {

    public static boolean first(int number)
    {
        for(int i=2; i<=number/2; i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    int pierwsza;
	Scanner wprowadz = new Scanner(System.in);
	System.out.println("Wprowadz liczbe: ");
	pierwsza = wprowadz.nextInt();

	if(Main.first(pierwsza))
    {
        System.out.println("Liczba jest pierwsza");
    }
	else
    {
        System.out.println("Liczba jest złożona");
    }

    }
}
