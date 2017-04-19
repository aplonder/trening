package main.impl;

/**
 * Created by root on 10.04.17.
 */
public final class Bagazowy extends AbstractSamochod {

    private int maxWalizek;
    private int obecnieWalizek;

    public Bagazowy(String marka, String kolor, int maxV, int przyspieszenie, int maxWalizek) {
        super(marka, kolor, maxV, przyspieszenie);
        this.maxWalizek = maxWalizek;
    }

    @Override
    public String getStan() {
        return marka + " obecnie przewozi " + obecnieWalizek + " walizek";
    }
    @Override
    public int setStan(int stan) {
        this.obecnieWalizek = stan;
        return obecnieWalizek;          //wyjasnic - zwracana inna zmienna niz w klasie osobowy, dzialanie poprawne
    }

    public String cecha() {
        return marka + " przewozi maksymalnie " + maxWalizek + " walizek.\n";
    }
}
