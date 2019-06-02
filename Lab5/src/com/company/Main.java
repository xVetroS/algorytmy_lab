package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int rozmiar,rodzaj_sortowania;
        Scanner wprowadz = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        rozmiar = wprowadz.nextInt();
        int sortowanie[] = new int[rozmiar];
        System.out.println("Wprowadz elementy dla tablicy o rozmiarze: ["+rozmiar+"].");
        for(int x = 0; x<sortowanie.length; x++)
        {
            sortowanie[x] = wprowadz.nextInt();
        }
        SelectionSort sel = new SelectionSort();
        QuickSort Qui = new QuickSort();
        System.out.println("Lista elementow przed sortowaniem wprowadzona przez użytkownika: ");
        sel.wypisz_tablice(sortowanie);
        System.out.println("1)SelectionSort, 2)QuickSort");
        rodzaj_sortowania = wprowadz.nextInt();
        switch(rodzaj_sortowania){
            case 1:
                System.out.println(" ");
                System.out.println("Lista elementow po sortowaniu SelectionSort:");
                sel.s_sort(sortowanie);
                sel.wypisz_tablice(sortowanie);
            break;
            case 2:
                System.out.println(" ");
                System.out.println("Lista elementow po sortowaniu QuickSort: ");
                Qui.quicksort(sortowanie,0,rozmiar-1);
                sel.wypisz_tablice(sortowanie);

        }

    }
}
