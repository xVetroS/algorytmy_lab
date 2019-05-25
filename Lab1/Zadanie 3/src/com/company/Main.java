package com.company;

import java.util.Scanner;

import static com.company.Silnia.silniaIteracyjnie; // importowanie statyczne z innej klasy.
import static com.company.Silnia.silniaRekurencyjna; // importowanie statyczne z innej klasy.


public class Main {

    public static void main(String[] args) {
	    int liczba;
	    Scanner wprowadz = new Scanner(System.in);
	    System.out.println("Wprowadz liczbe: ");
	    liczba = wprowadz.nextInt();
	    System.out.println("Liczona bedzie silnia z liczby: " + liczba + ".");
				System.out.println(liczba + "! = " + silniaRekurencyjna(liczba) + " rekurencja."); // Wywołanie wyniku silni rekurencyjnej z użyciem metody w osobnej klasie.
				System.out.println(liczba + "! = " + silniaIteracyjnie(liczba) + " iteracja."); // Wywołanie wyniku silni iteracyjnie z użyciem metody w osobnej klasie.

    }
}
