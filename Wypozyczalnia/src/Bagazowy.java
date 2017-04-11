/**
 * Created by root on 10.04.17.
 */
final class Bagazowy extends Samochod{

    private int maxwal;

    void przewoziw() {

        System.out.println(marka+ " przewozi maksymalnie " +maxwal);
    }

    Bagazowy(String m, String k, int v) {
        marka = m;
        kolor = k;
        maxv = v;
    }
}
