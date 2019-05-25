package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int a1,a2,b1,b2,c1,c2;
    int w, wx, wy;
	Scanner wprowadz = new Scanner(System.in);
    System.out.println("Wprowadź wyznaczniki: ");
    System.out.println("a1: ");
    a1 = wprowadz.nextInt();
    System.out.println("b1: ");
    b1 = wprowadz.nextInt();
    System.out.println("c1: ");
    c1 = wprowadz.nextInt();
    System.out.println("a2: ");
    a2 = wprowadz.nextInt();
    System.out.println("b2: ");
    b2 = wprowadz.nextInt();
    System.out.println("c2: ");
    c2 = wprowadz.nextInt();
    System.out.println("Wprowadzone wyznaczniki: " + "a1: " + a1 + " b1: " + b1 + " c1: " + c1 + " a2: " + a2 + " b2: " + b2 + " c2: " + c2);
    w =(a1*b2 - b1*a2);
    wx=(c1*b2-b1*c2);
    wy=(a1*c2-c1*a2);

    if(w!=0)
    {
        System.out.println("Układ równań jest oznaczony: ");
        System.out.println("x = " + wx/w );
        System.out.println("y = " + wy/w );
    }
    else
    {
        if(wx==0&&wy==0)
        {
            System.out.println("Układ jest nieoznaczony");
        }
        else
        {
            System.out.println("Uklad sprzeczny");
        }
    }
    }
}
