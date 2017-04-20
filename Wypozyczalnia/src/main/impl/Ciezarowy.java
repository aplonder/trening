package main.impl;

/**
 * Created by root on 10.04.17.
 */
public class Ciezarowy extends AbstractSamochod {

    protected int maxLadunek;
    protected int obecnieLadunek;

    public Ciezarowy(String marka, String kolor, int maxV, int przyspieszenie, RodzajPaliwa paliwo, int maxLadunek) {
        super(marka, kolor, maxV, przyspieszenie, paliwo);
        this.maxLadunek = maxLadunek;
    }

    @Override
    public String getStan() {
        return marka + " obecnie przewozi " + obecnieLadunek + " ton ladunku";
    }
    @Override
    public int setStan(int stan) {
        this.obecnieLadunek = stan;
        return obecnieLadunek;
    }

    public String cecha() {
        return marka + " przewozi maksymalnie " + maxLadunek + " ton ladunku.\n";
    }
}
