/**
 * Created by root on 10.04.17.
 */
class Ciezarowy extends Samochod {

    protected int maxlad;

    void przewoziL() {

        System.out.println(marka+ " przewozi maksymalnie " +maxlad);
    }

    Ciezarowy(String m, String k, int v) {
        super(m, k, v);
    }
}
