package com.company;

import java.util.Scanner;

public class DaneAdresowe {
    private String adres;
    private String imie;
    private String nazwisko;
    private int pesel;
    private Scanner scanner = new Scanner(System.in);

    public DaneAdresowe() {
        System.out.println("Podaj imię: ");
        imie = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        nazwisko = scanner.nextLine();
        System.out.println("Podaj adres: ");
        adres = scanner.nextLine();
        System.out.println("Podaj PESEL: ");
        pesel = scanner.nextInt();
    }


    @Override
    public String toString() {
        return  "PESEL: " + pesel + ", imię: " + imie + ", nazwisko: " + nazwisko + ", adres: " + adres;
    }
}
