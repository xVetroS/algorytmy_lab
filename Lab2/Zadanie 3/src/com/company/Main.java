package com.company;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
       int f,f0,f1;
       int i,n;

       f0=0;
       f1=1;
       Scanner wprowadz = new Scanner(System.in);
       System.out.println("Podaj ile wyrazów ciągu ma zostać ukazane: ");
       n = wprowadz.nextInt();
       for(i=1; i<=n; i++)
       {
           if(i>1)
           {
               f = f0 + f1;
               f0 = f1;
               f1 = f;
           }
           else f= i;
           System.out.println(f);
       }
    }
}
