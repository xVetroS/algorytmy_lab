package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class sortowanie_zbioru {

    public static List<Integer> swap(List<Integer> array)
    {
        int start = 0;
        int end = array.size()-1;
        while(start<end)
        {
            int zamiana = array.get(start);
            array.set(start,array.get(end));
            array.set(end, zamiana);
            start++;
            end--;

        }
        return array;
    }
    
    public void wypisz_dane_z_pliku(String nazwa_pliku, int numer, int typ_sortowania) throws FileNotFoundException
    {
        File file = new File("C:\\Labik\\Czas_Sortowania\\src\\com\\company\\"+nazwa_pliku+numer+".txt");
        String nazwa="";
        Scanner scanner = new Scanner(file);
        try {
            nazwa = scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        StringTokenizer token = new StringTokenizer(nazwa);
        int i = 0;
        List<Integer> wypis = new ArrayList<>();

        while(token.hasMoreTokens())
        {
            wypis.add(Integer.parseInt(token.nextToken()));
            System.out.print(wypis.get(i) + " ");
            i++;

        }

        switch(typ_sortowania) {
           /*QuickSort */ case 1:
                System.out.println("Dane po sortowaniu QuickSort: ");
                double start = System.currentTimeMillis();
                Qsort(wypis);
                System.out.println(wypis);
                double stop = System.currentTimeMillis();
                System.out.print("Czas: ");
                System.out.println((stop - start) + "s.");
                System.out.println(" ");
                break;
          /*SelectionSort */  case 2: System.out.println(" ");
            System.out.println("Dane po sortowaniu SelectionSort: ");
            double start2 = System.currentTimeMillis();
            System.out.println(selectionsort(wypis));
            double stop2 = System.currentTimeMillis();
            System.out.print("Czas: ");
            System.out.println((stop2 - start2) + "s.");
            System.out.println(" ");
            break;
            /*InsertionSort */
            case 3:
                System.out.println("Dane po sortowaniu InsertionSort: ");
                double start3 = System.currentTimeMillis();
                System.out.println(Isort(wypis));
                double stop3 = System.currentTimeMillis();
                System.out.print("Czas: ");
                System.out.println((stop3 - start3) + "s.");
                System.out.println(" ");
                break;
            /*BubbleSort */ case 4:
                System.out.println("Dane po sortowaniu BubbleSort: ");
                double start4 = System.currentTimeMillis();
                System.out.println(bubbleSort(wypis));
                double stop4 = System.currentTimeMillis();
                System.out.print("Czas: ");
                System.out.println((stop4 - start4) + "s.");
                System.out.println(" ");
                break;
            case 5:
                System.out.println(" ");
        }


    }



    public static List<Integer> selectionsort(List<Integer> arr)
    {
        int element = arr.size();

        for (int i = 0; i < element-1; i++)
        {
            //Znajduje minimalny element w tablicy.
            int min_idex = i;
            for (int j = i+1; j < element; j++)
                if (arr.get(j) < arr.get(min_idex))
                    min_idex = j;
            //Zamienia znaleziony minimalny element na pierwszy.
            int temp = arr.get(min_idex);
            arr.set(min_idex,arr.get(i));
            arr.set(i,temp);
        }
        return arr;
    }

    public static void Qsort(List<Integer> list) {
        Qsort(list, 0, list.size() - 1);
    }

    public static void Qsort(List<Integer> list, int from, int to) {
        if (from < to) {
            int pivot = from;
            int left = from + 1;
            int right = to;
            int pivotValue = list.get(pivot);
            while (left <= right) {
                while (left <= to && pivotValue >= list.get(left)) {
                    left++;
                }

                while (right > from && pivotValue < list.get(right)) {
                    right--;
                }
                if (left < right) {
                    Collections.swap(list, left, right);
                }
            }
            Collections.swap(list, pivot, left - 1);
            Qsort(list, from, right - 1);
            Qsort(list, right + 1, to);
        }
    }

    public static List<Integer> Isort(List<Integer> insertion)
    {
        int n = insertion.size();
        for (int i=1; i<n; ++i)
        {
            int key = insertion.get(i);
            int j = i-1;


            while (j>=0 && insertion.get(j) > key)
            {
                insertion.set(j+1,insertion.get(j));
                j = j-1;
            }
            insertion.set(j+1,key);
        }
        return insertion;
    }

    public static List<Integer> bubbleSort(List<Integer> bubble)
    {
        int n = bubble.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (bubble.get(j) > bubble.get(j+1))
                {
                    int temp = bubble.get(j);
                    bubble.set(j, j+1);
                    bubble.set(j+1, temp);
                }
        return bubble;
    }




}

