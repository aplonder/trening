package main;

/**
 * Created by root on 14.04.17.
 */
public interface Samochod {

    int getCounter();

    String getMarka();
    String getKolor();
    int getMaxV();
    int getPrzyspieszenie();

    int getPredkosc();
    void setPredkosc(int predkosc);

    String getStan();
    int setStan(int stan);

    int przyspiesz();

    String cecha();
}
