package main.impl;

import main.Samochod;

/**
 * Created by root on 09.04.17.
 */
public abstract class AbstractSamochod implements Samochod {

    private static int counter=0;

    protected String marka;
    protected String kolor;
    protected int predkoscMaksymalna;
    protected int przyspieszenie;
    protected int predkosc;         // domyslnie ustawiana na zero

    public enum RodzajPaliwa {PB, ON, LPG}          //enumy z duzej litery, dodac arg "nazwa" do enum
    public RodzajPaliwa paliwo;

    public AbstractSamochod(String marka, String kolor, int predkoszMaksymalna, int przyspieszenie, RodzajPaliwa paliwo) {
        this.marka = marka;
        this.kolor = kolor;
        this.predkoscMaksymalna = predkoszMaksymalna;
        this.przyspieszenie = przyspieszenie;
        this.paliwo = paliwo;
        counter=counter+1;
    }

    public int getCounter() {
        return counter;
    }

    public String getMarka() {
        return marka;
    }
    public String getKolor() {
        return kolor;
    }
    public int getPredkoscMaksymalna() {
        return predkoscMaksymalna;
    }
    public int getPrzyspieszenie() {
        return przyspieszenie;
    }


    public int getPredkosc() {
        return predkosc;
    }
    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }

    @Override
    public abstract String getStan();
    @Override
    public abstract int setStan(int stan);

    public int przyspiesz () {
        predkosc = predkosc + przyspieszenie;
        return predkosc;
    }

    public abstract String cecha();

    @Override
    public String toString() {
        return "Marka: " + marka +
                ", Kolor: " + kolor +
                ", Maksymalna predkosc: " + predkoscMaksymalna +
                ", Rodzaj paliwa: " + paliwo +
                ", Obecna prędkosc wynosi: " + predkosc +"\n" ;
    }
}
