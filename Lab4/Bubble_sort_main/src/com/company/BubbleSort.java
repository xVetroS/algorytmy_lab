package com.company;

public class BubbleSort {
    public static void sortowanie(int[]tablica_sortowania) //metoda statyczna sortowanie.
    {
        int n = tablica_sortowania.length; //dostep do ilości elementów.
        int licznik = 0; // licznik, ile razy przeszliśmy po naszej tablicy.
        while(licznik < n-1)
        {
            for(int j=0; j<n-1; j++)
            {
                if(tablica_sortowania[j] > tablica_sortowania[j+1])   {
                swap(tablica_sortowania, j, j+1); // wykorzystanie metody swap, czyli odwrócenie.
                }
            }
            licznik++;
        }
    }
    private static void swap(int[]tablica, int wartosc1, int wartosc2)
    {
        int temp = tablica[wartosc1]; // zapamietany element z wartosc 1.
        tablica[wartosc1] = tablica[wartosc2]; //przypisanie wartosc z indeksu drugiego do pierwszej wartosci.
        tablica[wartosc2] = temp; // pod wartość element indeksu drugiego, przypisujemy wartość lokalną.
    }
}
