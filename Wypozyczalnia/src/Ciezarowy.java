/**
 * Created by root on 10.04.17.
 */
class Ciezarowy extends Samochod {

    protected int maxlad;

    void przewozil() {

        System.out.println(marka+ " przewozi maksymalnie " +maxlad);
    }

    Ciezarowy(String m, String k, int v) {
        marka = m;
        kolor = k;
        maxv = v;
    }
}
