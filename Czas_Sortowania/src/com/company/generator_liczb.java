package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class generator_liczb {


    public static  List<Integer> generowanie_losowych(int konkretnie_ile)
    {
        List<Integer> tablica = new ArrayList<>();

                for(int i=0; i<konkretnie_ile;i++)
                {
                    Random zbior_losowy = new Random();
                    tablica.add(i, zbior_losowy.nextInt(100));
                }

        return tablica;
    }
}
