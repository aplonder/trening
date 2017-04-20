package main.impl;

/**
 * Created by root on 09.04.17.
 */
public final class Osobowy extends AbstractSamochod {

    private int maxOsob;
    private int obecnieOsob;

    public Osobowy(String marka, String kolor, int maxV, int przyspieszenie, rodzajPaliwa paliwo, int maxOsob) {
        super(marka, kolor, maxV, przyspieszenie, paliwo);
        this.maxOsob = maxOsob;
    }

    @Override
    public String getStan() {
        return marka + " obecnie przewozi " + obecnieOsob + " osob";
    }
    @Override
    public int setStan(int stan) {
        this.obecnieOsob = stan;
        return stan;                //wyjasnic - zwracana inna zmienna niz w klasie bagazowy, dzialanie poprawne
    }

    public String cecha() {
        return marka + " przewozi maksymalnie " + maxOsob + " osob.\n";
    }

    @Override
    public String toString() {
        return super.toString();
    }

/*
    public final void przewoziMaxOsob() {
        System.out.println(marka+ " przewozi maksymalnie " + maxOsob);
    }

    public void setObecnieOsob(int obecnieOsob) {
        this.obecnieOsob = obecnieOsob;
    }
*/


}

