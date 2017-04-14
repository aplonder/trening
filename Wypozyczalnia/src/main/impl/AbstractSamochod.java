package main.impl;

import main.Samochod;

/**
 * Created by root on 09.04.17.
 */
abstract class AbstractSamochod implements Samochod {

    protected String marka;
    protected String kolor;
    protected int maxv;
    protected int predkosc;

    private static int counter=0;

    public AbstractSamochod(String marka, String kolor, int maxv) {
        this.marka = marka;
        this.kolor = kolor;
        this.maxv = maxv;
        counter=counter+1;
    }

    public String getMarka() {
        return marka;
    }

    public String getKolor() {
        return kolor;
    }

    public int getMaxv() {
        return maxv;
    }

    public int getPredkosc() {
        return predkosc;
    }

    public int getCounter() {
        return counter;
    }

    public void doPrzodu() {
        System.out.println(marka+ " jedzie do przodu.\n");
    }

    public void doTylu() {
        System.out.println(marka+ " jedzie do tylu.\n");
    }

    public void wLewo() {
        System.out.println(marka+ " skreca w lewo.\n");
    }

    public void wPrawo() { System.out.println(marka+ " skreca w prawo.\n"); }


    public abstract int przyspiesz();





    @Override
    public String toString() {
        return "Marka: " + marka +
                " Kolor: " + kolor +
                " Maksymalna predkosc: " + maxv + "\n" ;
    }
}
