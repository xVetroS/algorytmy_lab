package com.company;

public class Main {

    public static void main(String[] args) {

//Inicjacja zmiennych w naszym programie
        int odnalezione = 0;
        int element = 1;
        int suma_dzielnikow = 0;
        int doskonale[] = new int[2];

//Wykonuj nasz program do momentu odnalezienia dwoch liczb doskonalych z zakresu.
        while (odnalezione < 2) {
//Sprawdza czy element jest liczba doskonala
            for (int i = 1; i <= (element/2); i++) {
                if ((element % i) == 0)
                    suma_dzielnikow += i;
            }
//Jezeli nasz element jest liczba doskonala to dodawany jest do tablicy.
            if (suma_dzielnikow == element) {
                doskonale[odnalezione] = element;
                ++odnalezione;
            }
        //Inkrementuje nasz element.
            ++element;
            suma_dzielnikow = 0;
        }

//Wypisz znalezione liczby doskonałe
        System.out.println("Liczby doskonałe z zakresu <2,30>:");
        for (int e : doskonale) {
            System.out.print(e + ", ");
            //Petla w celu wypisania liczb pierwszych z danego zakresu, jest to petla foreach.
        }
    }
}