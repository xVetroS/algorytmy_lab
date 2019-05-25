package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                int a, b, c, x, i;
                double delta, x1, x2, x0;
                Scanner sc = new Scanner(System.in);
                System.out.println("Podaj współczynnik a: ");
                a = sc.nextInt();
                System.out.println("Podaj współczynnik b: ");
                b = sc.nextInt();
                System.out.println("Podaj współczynnik c: ");
                c = sc.nextInt();
                System.out.println("Podane współczynniki to: "+ "a = "+ a + " b = "+ b + " c = " + c + ".");

                if(a==0 && b ==0 && c ==0)
                {
                    System.out.println("Równanie ma nieskończoną ilość rozwiązań.");
                }
                if(a==0 && b !=0)
                {
                    System.out.println("Jest to równanie liniowe.");
                    x = -c / a;
                    System.out.println("Rozwiazaniem równania liniowego jest: " + x + ".");
                }
                else if (a!=0)
                {
                    System.out.println("Równanie jest kwadratowe.");
                    delta = (b*b) - (4*a*c);
                    System.out.println("Delta wynosi: " + delta);
                    if(delta>0)
                    {
                        x1 = (-b - Math.sqrt(delta)) / (2*a);
                        x2 = (-b - Math.sqrt(delta)) / (2*a);
                        System.out.println("Rozwiazania rzeczywiste: ");
                        System.out.println("x1 = " + x1 + " x2 = " + x2 + ".");
                    }
                    if(delta == 0)
                    {
                        x0 = -b / (2*a);
                        System.out.println("Rozwiązaniem równania kwadratowego jest: " + x0);
                    }
                    if(delta < 0)
                    {
                        x = (-b / (2*a));
                        i = (int) Math.sqrt(delta);
                        System.out.println("Rozwiązanie zespolone: " + x + " + " + i + "*i");
                        System.out.println("Rozwiązanie zespolone: " + x + " - " + i + "*i");
                    }
                }


            }
        }