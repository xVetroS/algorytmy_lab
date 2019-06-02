package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        String napis,szyfr,deszyfr;
        szyfrowanie cezar = new szyfrowanie();
        Scanner wprowadz = new Scanner(System.in);
        System.out.println("Wprowadź napis do zaszyfrowania: ");
        napis = wprowadz.nextLine();
        System.out.println("Wprowadzony napis: " + napis + ".");
        System.out.println("Wyraz po szyfrowaniu szyfrem Cezara: " + cezar.szyfrowanie(napis) + ".");
        szyfr = cezar.szyfrowanie(napis);
        deszyfr = cezar.deszyfrowanie(szyfr);
        System.out.println("Wyraz po deszyfrowaniu jest rowny: " + deszyfr + ".");


    }
}
