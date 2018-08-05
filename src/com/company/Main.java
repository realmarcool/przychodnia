package com.company;

import java.util.*;

public class Main {

    private static void menu () {
        System.out.println("MENU:\n1: Dodaj nowego pacjenta");
        System.out.println("2: Dodaj lekarza");
        System.out.println("3: Umówienie wizyty");
        System.out.println("4: Wyświetlenie listy wizyt");
        System.out.println("5: WYJDŹ");
    }

    public static void main(String[] args) {
        Queue<Wizyty> wizyty = new LinkedList<>();
        Scanner pobierzInt = new Scanner(System.in);
        int menu = 0;
        List<Pacjent> listaPacjentow = new ArrayList<>();
        List<Lekarz> listaLekarzy = new ArrayList<>();
        while (menu<5){
        menu();
        menu = pobierzInt.nextInt();
        switch (menu){
            case 1:
                listaPacjentow.add(new Pacjent(new DaneAdresowe()));
                System.out.println("Dodano pacjenta");
                break;
            case 2:
                listaLekarzy.add(new Lekarz(new DaneAdresowe()));
                System.out.println("Dodano lekarza");
                break;
            case 3:
                System.out.println(listaPacjentow.get(0));
                System.out.println(listaLekarzy.get(0));
                ((LinkedList<Wizyty>) wizyty).add(new Wizyty(listaPacjentow.get(0), listaLekarzy.get(0)));
                break;
            case 4:
                System.out.println("Lista wizyt:");
                System.out.println(wizyty);
            case 5:
                break;}




        }














    }
}