package main.impl;

import main.impl.AbstractSamochod;

/**
 * Created by root on 10.04.17.
 */
public final class Bagazowy extends AbstractSamochod {

    private int maxwal;
    private static final int PRZYSPIESZENIE =20;



    public int przyspiesz () {
        predkosc= predkosc + PRZYSPIESZENIE;
        return predkosc;
    }

    public final void przewoziW() {

        System.out.println(marka+ " przewozi maksymalnie " +maxwal);
    }

    public Bagazowy(String m, String k, int v) {
       super(m, k, v);
    }
}
