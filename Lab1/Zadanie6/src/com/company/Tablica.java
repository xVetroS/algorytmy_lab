package com.company;

public class Tablica {
    public static int maxValue(int tablica2[]) //metoda zwraca największą liczbę w tablicy.
    {
        int a=0;
        for(int i=0; i< tablica2.length; i++)
        {
            if(tablica2[i]>a)
            {
                a=tablica2[i];
            }
        }
        return a;
    }

    public static int minValue(int tablica3[]) //metoda minimalna wartość.
    {
        int a=999999999;
        for(int i=0; i< tablica3.length; i++)
        {
            if(tablica3[i]<a)
            {
                a=tablica3[i];
            }
        }
        return a;
    }

    public static int rozrzutValue(int max, int min) //metoda rozrzutu.
    {
        int a = max-min;
        return a;
    }

    public static int sumaValue(int tablica4[]) // zwraca sumę elementów.
    {
        int suma = 0;
        for(int i=0; i< tablica4.length; i++)
        {
            suma+=tablica4[i];
        }
        return suma;
    }

    public static double srValue(int tablicasr[]) //metoda średniej wartości elementów.
    {
        int suma = 0;
        for(int i=0; i< tablicasr.length; i++)
        {
            suma+=tablicasr[i];
        }
        return suma / tablicasr.length;
    }

    public static double variance(int tablicav[]) //metoda wariacji.
    {
        double sr = srValue(tablicav);
        double sigma, sumka = 0;

        for(int i = 0; i < tablicav.length; i++){
            sumka += Math.pow((tablicav[i] - sr), 2);
        }
        sigma = sumka/tablicav.length;


        return sigma;
    }

    public static double standard(double variance1)
    {
        return Math.sqrt(variance1);
    }

    public static int elements(int tabe[]) // metoda zwraca liczbe elementów, które są podzielne przez 3.
    {
        int zmienna = 0;
        for(int i=0; i<tabe.length; i++)
            if(tabe[i]%3==0) zmienna+=1;
        return zmienna;
    }





}
