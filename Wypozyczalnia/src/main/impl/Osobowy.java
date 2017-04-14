package main.impl;

import main.impl.AbstractSamochod;

/**
 * Created by root on 09.04.17.
 */
public final class Osobowy extends AbstractSamochod {

    private int maxosob;
    private int przyspieszenie;

    public final void przewoziO() {

        System.out.println(marka+ " przewozi maksymalnie " +maxosob);
    }

    public final void ile(int i) {
         maxosob=i;

    }

     public int przyspiesz () {
        return predkosc+przyspieszenie;

    }



    public Osobowy(String m, String k, int v) {
        super(m, k, v);



    }

    @Override
    public String toString() {
        return super.toString() + " maksymalna ilosc osob: " +maxosob ;
    }
}
