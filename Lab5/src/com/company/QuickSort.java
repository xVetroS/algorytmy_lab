package com.company;

public class QuickSort {


        public void quicksort(int tablica[], int x, int y) {

            int z,j,v,temp;

            z=x;
            j=y;
            v=tablica[(x+y) / 2];
            do {
                while (tablica[z]<v)
                    z++;
                while (v<tablica[j])
                    j--;
                if (z<=j) {
                    temp=tablica[z];
                    tablica[z]=tablica[j];
                    tablica[j]=temp;
                    z++;
                    j--;
                }
            }
            while (z<=j);
            if (x<j)
                quicksort(tablica,x,j);
            if (z<y)
                quicksort(tablica,z,y);
        }
    }
