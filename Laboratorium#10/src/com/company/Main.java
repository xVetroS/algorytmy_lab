package com.company;

import java.util.*;

public class Main {

    public static void Menu()
    {
        System.out.println("1. Stos");
        System.out.println("2. Kolejka");
        System.out.println("3. Wektor");
    }

    public static void main(String[] args) {
        Boolean koniec = true;
        int menu;
        do {
            Menu();
            Scanner wprowadz = new Scanner(System.in);
            menu = wprowadz.nextInt();
            switch (menu) {
                case 1:
                    int stack_remove, search_element, secret;
                    Stack<Integer> stos = new Stack<>();
                    System.out.println("Kolekcja Stos - kilka podstawowch działań: ");
                    System.out.println("Stos <Push>: ");
                    for(int i=0; i<5; i++)
                    {
                        stos.push(i);
                    }
                    System.out.println(stos);
                    System.out.println("Stos <Pop>: ");
                    stos.pop();
                    System.out.println(stos);
                    System.out.println("Jaki element ze stosu chcesz usunac?");
                    stack_remove = wprowadz.nextInt();
                    if(stack_remove == stos.peek())
                    {
                        System.out.println("Usunięto element z góry!");
                    }
                    else
                    {
                        System.out.println("Musisz zabrać element z góry aby dotrzeć do tego i go usunąć!");
                    }

                    System.out.println("Element górny stosu: ");
                    System.out.println(stos.peek());
                    System.out.println("Jaki element stosu chcesz sprawdzić?");
                    search_element = wprowadz.nextInt();
                    stos.search(search_element);

                    secret = wprowadz.nextInt();
                    System.out.println("Czy element " + secret + " wystepuje w obecnym stosie?");
                    if(stos.contains(secret)) {
                        System.out.println("Taki element stosu istnieje!");
                    }
                    else
                    {
                        System.out.println("Nie ma takiego elementu na stosie!");
                    }
                    System.out.println("Rozmiar stosu aktualnie wynosi: ");
                    System.out.println(stos.size());

                    System.out.println("Czy stos zawiera elementy w sobie? ");
                    if(stos.isEmpty())
                    {
                        System.out.println("Stos nie zawiera elementow!");
                    }
                    else
                    {
                        System.out.println("Stos zawiera elementy!");
                    }


                    break;
                case 2:
                    int remove_queue, search_queue, secret_queue;
                    Queue<Integer> kolejka = new ArrayDeque<>();
                    System.out.println("Kolejka: ");
                    for(int i=0; i<=10; i++)
                    {
                        kolejka.add(i);
                    }
                    System.out.println(kolejka);

                    System.out.println("Usuniecie elementu z kolejki: ");
                    remove_queue = wprowadz.nextInt();
                    kolejka.remove();

                    System.out.println(kolejka);

                    System.out.println("Rozmiar kolejki: ");
                    System.out.println(kolejka.size());

                    System.out.println("Pierwszy element:  ");
                    System.out.println(((ArrayDeque<Integer>) kolejka).peekFirst());
                    System.out.println("Ostatni element:  ");
                    System.out.println(((ArrayDeque<Integer>) kolejka).peekLast());

                    System.out.println("Czy element istnieje w kolejce? ");
                    secret_queue = wprowadz.nextInt();

                    if(kolejka.contains(secret_queue))
                    {
                        System.out.println("Istnieje taki element!");
                    }
                    else
                    {
                        System.out.println("Nie istnieje taki element!");
                    }

                    if(kolejka.isEmpty())
                    {
                        System.out.println("Kolejka jest pusta");
                    }
                    else
                    {
                        System.out.println("Kolejka zawiera elementy!");
                    }




                    break;
                case 3:
                    int drop_vec, search_ele_v, secret_v;
                    Vector<String> vec_tor = new Vector<String>();
                    System.out.println("Dodanie elementu: ");
                    vec_tor.add("Adam");
                    vec_tor.add("Michal");
                    vec_tor.add("Joanna");
                    System.out.println(vec_tor);
                    System.out.println("Jaki element chcesz wykasowac? ");
                    drop_vec = wprowadz.nextInt();
                    vec_tor.remove(drop_vec);
                    System.out.println(vec_tor);
                    System.out.println("Rozmiar wektoru: ");
                    vec_tor.size();
                    System.out.println("Jaki element chcesz pobrac z wektora?");
                    search_ele_v = wprowadz.nextInt();
                    System.out.println(vec_tor.get(search_ele_v));

                    System.out.println("Czy element istnieje w danym wektorze?");
                    secret_v = wprowadz.nextInt();
                    if(vec_tor.contains(secret_v))
                    {
                        System.out.println("Istnieje taki element we wektorze!");
                    }
                    else
                    {
                        System.out.println("Nie ma takiego elementu we wektorze!");
                    }

                    if(vec_tor.isEmpty())
                    {
                        System.out.println("Wektor jest pusty!");
                    }
                    else
                    {
                        System.out.println("Wektor posiada elementy!");
                    }

                    break;
                case 4:
                    koniec = false;
                    System.out.println("Program zakończył działanie...");
                    break;
                default:
                    System.out.println("Nie ma takiej opcji do wyboru!");
            }

        } while(koniec);
    }
}
