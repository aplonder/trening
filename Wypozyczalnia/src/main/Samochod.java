package main;

import main.impl.AbstractSamochod;

/**
 * Created by root on 14.04.17.
 */
public interface Samochod {

    int getCounter();

    String getMarka();
    String getKolor();
    int getPredkoscMaksymalna();
    int getPrzyspieszenie();

    int getPredkosc();
    void setPredkosc(int predkosc);

    String getStan();
    int setStan(int stan);

    int przyspiesz();

    String cecha();
}
