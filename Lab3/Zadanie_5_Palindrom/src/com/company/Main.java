package com.company;
import java.util.*;



public class Main {

    public static boolean palindrom(String ciag)
    {
        StringBuilder tekst = new StringBuilder(ciag);
        return ciag.equals(tekst.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        System.out.println("Podaj ciag znakow: ");
        String ciag = wprowadz.nextLine();
        System.out.println("Ciąg znaków: " + ciag + (Main.palindrom(ciag)? " jest" : " nie jest") + " palindromem.");
    }
}
