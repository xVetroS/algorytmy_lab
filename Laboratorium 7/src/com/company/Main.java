package com.company;

import java.util.Scanner;


public class Main {

    public static int partycja(int c[], int a, int b)
    {
        int e,tmp;
        e=c[a];        //elemennt dzielacy
        while (a<b)
        {
            while ((a<b) && (c[b]>=e)) b--;
            while ((a<b) && (c[a]<e)) a++;
            if (a<b)
            {
                tmp=c[a];
                c[a]=c[b];
                c[b]=tmp;
            }
        }
        return a;
    }


    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        int n, i, j, k, w;
        int c[] = new int[100];


        System.out.println("Podaj liczbe elementow ciagu");
        n = wprowadz.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println("Podaj " + (i + 1) + " element ciagu");
            c[i] = wprowadz.nextInt();
        }
        System.out.println("Podaj ktory element wytypować: \n");
        w = wprowadz.nextInt();

        if (w > n) {
            System.out.println("Liczba wykracza po za zakres!");
        } else {
            i = 0;
            j = n - 1;
            n = w;
            while (i != j) {
                k = partycja(c, i, j);
                k = k - i + 1;
                if (k >= w) j = i + k - 1;
                if (k < w) {
                    w -= k;
                    i += k;
                }
            }
            System.out.println(n + " element ciagu to " + c[i]);

        }
    }
}