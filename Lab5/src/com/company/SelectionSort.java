package com.company;

public class SelectionSort {

    public static void wypisz_tablice(int tablica[])
    {
        int n = tablica.length;
        for (int i=0; i<n; ++i)
            System.out.print(tablica[i]+" ");
        System.out.println();
    }

    public static void s_sort(int arr[])
    {
        int element = arr.length;

        for (int i = 0; i < element-1; i++)
        {
            //Znajduje minimalny element w tablicy.
            int min_idex = i;
            for (int j = i+1; j < element; j++)
                if (arr[j] < arr[min_idex])
                    min_idex = j;
            //Zamienia znaleziony minimalny element na pierwszy.
            int temp = arr[min_idex];
            arr[min_idex] = arr[i];
            arr[i] = temp;
        }
    }
}
