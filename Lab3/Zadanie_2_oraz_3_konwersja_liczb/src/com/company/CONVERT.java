package com.company;

public class CONVERT {
    private static final int MAX_BAZA = 36;
    private static final String pattern = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String zamiana_na_bin_szesnastkowy(int liczba, int baza)
    {
        String rezultat = "";

        if ((baza > MAX_BAZA) || (baza < 2))
            return null;


        if (liczba == 0)
            return "0";

        while (liczba>0)
        {
            rezultat = pattern.charAt(liczba % baza) + rezultat;
            liczba /= baza;
        }

        return rezultat;
    }
    public static int zamiana_z_binarnego_na_dziesietny(int dwojkowy){
        int dziesietny = 0;
        int n = 0;
        while(true){
            if(dwojkowy == 0){
                break;
            } else {
                int temp = dwojkowy%10;
                dziesietny += temp*Math.pow(2, n);
                dwojkowy = dwojkowy/10;
                n++;
            }
        }
        return dziesietny;
    }
    public static int zamiana_szesnastkowy_na_dziesietny (String hex){
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++)
        {
            char c = hex.charAt(i);
            int d = pattern.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
}
