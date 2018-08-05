package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Wizyty {
    private Pacjent pacjent;
    private Lekarz lekarz;

    public Wizyty(Pacjent pacjent, Lekarz lekarz) {
        this.pacjent = pacjent;
        this.lekarz = lekarz;
    }

    @Override
    public String toString() {
        return "Wizyta: " + pacjent + " - " + lekarz;
    }

}
