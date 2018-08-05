package com.company;

public class Pacjent {
        private DaneAdresowe daneAdresowe;


    public Pacjent(DaneAdresowe daneAdresowe) {
        this.daneAdresowe = daneAdresowe;
    }

    @Override
    public String toString() {
        return "Pacjent{" + daneAdresowe +
                '}';
    }
}
