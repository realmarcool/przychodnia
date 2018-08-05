package com.company;

public class Lekarz {

    private DaneAdresowe daneAdresowe;

    public Lekarz(DaneAdresowe daneAdresowe) {
        this.daneAdresowe = daneAdresowe;
    }
    @Override
    public String toString() {
        return "Lekarz{" + daneAdresowe +
                '}';
    }

}
