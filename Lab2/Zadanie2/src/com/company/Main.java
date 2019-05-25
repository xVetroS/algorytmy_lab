package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public int choice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] autoSetMatrix(int il) {
        Random random = new Random();
        int tab[] = new int[il];
        if (il == 4) {
            for (int i = 0; i < 4; i++) {
                tab[i] = random.nextInt(50);
            }
            return tab;
        } else {
            for (int i = 0; i < 9; i++) {
                tab[i] = random.nextInt(50);
            }
            return tab;
        }


    }

    public int whatMatrix() {     //wybór między macierzem 2x2 czy 3x3
        int il = 0;
        System.out.println("macierz 2x2 (wcisnij 0)czy 3x3(wcisnij inny przycisk");
        Scanner scanner = new Scanner(System.in);
        il = scanner.nextInt();
        if (il == 0) {
            return 4;
        } else return 9;
    }

    public static int[] transpositionMatrix(int tab[], int il) {               //transpozycja macierzy
        System.out.println("przebiega proces transpozycji");
        int pom = 0;
        if (il == 4) {
            pom = tab[1];
            tab[1] = tab[2];
            tab[2] = pom;
            return tab;
        } else {
            pom = tab[1];
            tab[1] = tab[3];
            tab[3] = pom;
            pom = tab[2];
            tab[2] = tab[6];
            tab[6] = pom;
            pom = tab[5];
            tab[5] = tab[7];
            tab[7] = pom;
            return tab;
        }
    }

    public void viewMatrix(int tab[], int il) {//prezentacja macierzy
        if (il == 4) {
            System.out.println("+---+---+");
            System.out.println("| " + tab[0] + " | " + tab[2] + "|");
            System.out.println("+---+---+");
            System.out.println("| " + tab[1] + " | " + tab[3] + "|");
            System.out.println("+---+---+");
        } else {
            System.out.println("+---+---+---+");
            System.out.println("| " + tab[0] + " | " + tab[3] + " | " + tab[6] + " |");
            System.out.println("+---+---+---+");
            System.out.println("| " + tab[1] + " | " + tab[4] + " | " + tab[7] + " |");
            System.out.println("+---+---+---+");
            System.out.println("| " + tab[2] + " | " + tab[5] + " | " + tab[8] + " |");
            System.out.println("+---+---+---+");
        }
    }

    public static int[] setMatrix(int il) {//pobranie wartości do macierzy
        Scanner scanner = new Scanner(System.in);
        if (il == 4) {
            int tab[] = new int[4];
            System.out.println(" podaj wartości dla macierza kwadratowego który wygląda tak :");
            System.out.println("+---+---+");
            System.out.println("|a1 | b1|");
            System.out.println("+---+---+");
            System.out.println("|a2 | b2|");
            System.out.println("+---+---+");

            for (int i = 0; i < 2; i++) {
                System.out.println("Podaj a" + (i + 1));
                tab[i] = scanner.nextInt();
            }
            for (int i = 2; i < 4; i++) {
                System.out.println("Podaj b" + (i + 1));
                tab[i] = scanner.nextInt();
            }
            return tab;
        } else {
            int tab[] = new int[9];
            System.out.println(" podaj wartości dla macierza kwadratowego który wygląda tak :");
            System.out.println("+---+---+---+");
            System.out.println("|a1 | b1| c1|");
            System.out.println("+---+---+---+");
            System.out.println("|a2 | b2| c2|");
            System.out.println("+---+---+---+");
            System.out.println("|a3 | b3| c3|");
            System.out.println("+---+---+---+");
            for (int i = 0; i < 3; i++) {
                System.out.println("Podaj a" + (i + 1));
                tab[i] = scanner.nextInt();
            }
            for (int i = 3; i < 6; i++) {
                System.out.println("Podaj b" + (i - 2));
                tab[i] = scanner.nextInt();
            }
            for (int i = 6; i < 9; i++) {
                System.out.println("Podaj c" + (i - 5));
                tab[i] = scanner.nextInt();
            }
            return tab;
        }

    }

    public static int[] matrixMulti(int tab[], int tab1[], int il) {           //mnożenie macierzy
        int tab2[] = new int[il];
        if (il == 4) {
            tab2[0] = (tab[0] * tab1[0]) + (tab[2] * tab1[1]); // w tym przypadku nie robiłem pętli bo po wstepnych obliczeniach zajęło by 1 linijke więcej niż ten zapis
            tab2[1] = (tab[0] * tab1[2]) + (tab[2] * tab1[3]);
            tab2[2] = (tab[1] * tab1[0]) + (tab[3] * tab1[1]);
            tab2[3] = (tab[1] * tab1[2]) + (tab[3] * tab1[3]);
            return tab2;
        } else {
            int a = 0;
            for (int j = 0; j < 7; j = j + 3) {
                for (int i = 0; i < 3; i++) {
                    tab2[a] = (tab[i] * tab[j]) + (tab[(3 + i)] * tab[(j + 1)]) + (tab[(6 + i)] * tab[(j + 2)]);  //zapis skrócony z pętlą równainai poniżej
                    a++;
                }
            }
          /*  tab2[0]=(tab[0]*tab1[0])+(tab[3]*tab1[1])+(tab[6]*tab1[2]);
            tab2[1]=(tab[1]*tab1[0])+(tab[4]*tab1[1])+(tab[7]*tab1[2]);
            tab2[2]=(tab[2]*tab1[0])+(tab[5]*tab1[1])+(tab[8]*tab1[2]);
            tab2[3]=(tab[0]*tab1[3])+(tab[3]*tab1[4])+(tab[6]*tab1[5]);
            tab2[4]=(tab[1]*tab1[3])+(tab[4]*tab1[4])+(tab[7]*tab1[5]);
            tab2[5]=(tab[2]*tab1[3])+(tab[5]*tab1[4])+(tab[8]*tab1[5]);
            tab2[6]=(tab[0]*tab1[6])+(tab[3]*tab1[7])+(tab[6]*tab1[8]);
            tab2[7]=(tab[1]*tab1[6])+(tab[4]*tab1[7])+(tab[7]*tab1[8]);
            tab2[8]=(tab[2]*tab1[6])+(tab[5]*tab1[7])+(tab[8]*tab1[8]);
         */
            return tab2;
        }
    }

    public void matrixDesignation(int tab[], int il) {//wskażnik macierzy
        if (il == 4) {
            System.out.println("Wyznacznik macierzy to " + ((tab[0] * tab[3]) - (tab[1] * tab[2])));
        } else {
            il = (tab[0] * tab[4] * tab[8]) + (tab[3] * tab[7] * tab[2]) + (tab[6] * tab[1] * tab[5]) - (tab[0] * tab[7] * tab[5]) - (tab[3] * tab[1] * tab[8]) - (tab[6] * tab[4] * tab[2]);
            System.out.println("Wyznacznik macierzy to " + il);
        }

    }

    public static void main(String[] args) {
        Macierz_Kwadratowy macierz_kwadratowy = new Macierz_Kwadratowy();
        int il = macierz_kwadratowy.whatMatrix();
        int tab2[] = new int[il];
        int tab[] = new int[il];
        int tab1[] = new int[il];
        System.out.println("autouzpełnianie macierzy czy chesz wisac ręcznie ? (Ręcznie=0 AUTO=reszta");
        if (macierz_kwadratowy.choice() == 0) {
            tab = macierz_kwadratowy.setMatrix(il);
            tab1 = macierz_kwadratowy.setMatrix(il);
        } else {
            tab = autoSetMatrix(il);
            tab1 = autoSetMatrix(il);
        }
        macierz_kwadratowy.viewMatrix(tab, il);
        macierz_kwadratowy.matrixDesignation(tab, il);
        macierz_kwadratowy.viewMatrix(tab1, il);
        macierz_kwadratowy.matrixDesignation(tab, il);
        tab2 = macierz_kwadratowy.matrixMulti(tab, tab1, il);
        System.out.println("macierz po wymnożeniu");
        macierz_kwadratowy.viewMatrix(tab2, il);
        tab2 = macierz_kwadratowy.transpositionMatrix(tab2, il);
        macierz_kwadratowy.viewMatrix(tab2, il);
    }
}
