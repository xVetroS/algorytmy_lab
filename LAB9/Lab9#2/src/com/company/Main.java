package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        List<Stos> stos = new ArrayList<>();
        System.out.println("Podaj działanie ONP do obliczenia: ");

        String dzialanie = wprowadz.nextLine();

        for (int i = 0; i < dzialanie.length(); i++) {
            if (dzialanie.charAt(i) >= 48  && dzialanie.charAt(i)  <= 57) {
                String typ = dzialanie;
                Stos.pushElement(stos, typ);
            } else if (dzialanie.charAt(i) == '+' || dzialanie.charAt(i) == '-'
                    || dzialanie.charAt(i) == '*' || dzialanie.charAt(i) == '/') {
                int a, b, result = 0;
                a = (Stos.Pop(stos));
                b = (Stos.Pop(stos));

                switch (dzialanie.charAt(i))
                {
                    case '+':
                        result = (b + a);
                        break;
                    case '-':
                        result = (b - a);
                        break;
                    case '*':
                        result = b * a;
                        break;
                    case '/':
                        result = b / a;
                        break;
                }
                Stos.pushElement(stos, result);
            }
        }
        System.out.println(Stos.Pop(stos));
    }
}