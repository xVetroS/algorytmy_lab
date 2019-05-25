package com.company;

public class InsertionSort {
    public static void sortowanie(int[]tablica_sortowania) //metoda statyczna sortowanie.
    {
        int n = tablica_sortowania.length; //dostep do ilości elementów.
        int obecny_element;
        int inny_element;
        for(int i = 1; i < n; i++) // interacja zerowa, my o jedno miejsce przed nią do czasu końca tablicy.
        {
            obecny_element = tablica_sortowania[i]; // pamiętany obecny element, pobrany element z indexu i.
            inny_element = i; //wskazuje to samo miejsce co nas licznik na samym początku.
            while(inny_element > 0 && obecny_element < tablica_sortowania[inny_element-1]) // pierwszy warunek: inny_element mniejszy od zera,  drugi warunek: nasz obecny ma być mniejszy od wartości pod indeksem inny_element-1;
            {
                tablica_sortowania[inny_element] = tablica_sortowania[inny_element-1]; // wartość pod indexem inny_element nadpisana wartością wcześniejszą.
                inny_element--; //zmniejszamy o jeden.
            }
            tablica_sortowania[inny_element] = obecny_element; // nadpisanie odpowiadającego miejsca.
        }
    }
}
