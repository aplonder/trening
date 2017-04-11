/**
 * Created by root on 09.04.17.
 */
 final class Osobowy extends Samochod {

    private int maxosob;

     void przewozio() {

        System.out.println(marka+ " przewozi maksymalnie " +maxosob);
    }

    void ile(int i) {
         maxosob=i;

    }

    Osobowy(String m, String k, int v) {
        marka = m;
        kolor = k;
        maxv = v;
    }
}
