package com.company;

import java.util.List;

import static java.lang.Integer.parseInt;

public class Stos
    {
        public int s_character;
        public Stos(int sName)
        {
            s_character = sName;
        }

        public static int Pop(List<Stos> stos){
            int a = stos.get(stos.size() - 1).s_character;
            stos.remove(stos.size()-1);
            return a;
        }

        public static void pushElement(List<Stos> stos, String x)
        {
            int a = parseInt(x);
            stos.add(new Stos(a));
        }

        public static void pushElement(List<Stos> stos, int a)
        {
            stos.add(new Stos(a));
        }



}
