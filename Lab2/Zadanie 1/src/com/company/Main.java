package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b,c, obwod;
        Scanner wprowadz = new Scanner(System.in);
        System.out.println("Podaj bok a: ");
        a = wprowadz.nextInt();
        System.out.println("Podaj bok b: ");
        b = wprowadz.nextInt();
        System.out.println("Podaj bok c: ");
        c = wprowadz.nextInt();
        if(a+b>c&&a+c>b&&b+c>a)
        {
            System.out.println("Z tych boków da się zbudować trójkąt.");
            obwod = a+b+c;
            double p = ((a+b+c)/2);
            double pole = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Obwód tego trójkąta wynosi: " + obwod + ".");
            System.out.println("Pole tego trójkąta wynosi: " + pole + ".");
        }
        else
        {
            System.out.println("Z podanych boków nie da się stworzyć trójkąta.");
        }
    }
}
