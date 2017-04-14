/**
 * Created by root on 09.04.17.
 */
 final class Osobowy extends Samochod {

    private int maxosob;

    final void przewoziO() {

        System.out.println(marka+ " przewozi maksymalnie " +maxosob);
    }

    final void ile(int i) {
         maxosob=i;

    }

    Osobowy() {};

    Osobowy(String m, String k, int v) {
        super(m, k, v);



    }
}
