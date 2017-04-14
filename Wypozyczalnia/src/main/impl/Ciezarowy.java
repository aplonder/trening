package main.impl;

import main.impl.AbstractSamochod;

/**
 * Created by root on 10.04.17.
 */
public class Ciezarowy extends AbstractSamochod {

    protected int maxlad;
    protected int przyspieszenie;


    public int przyspiesz () {
        return predkosc + przyspieszenie;
    }

    public void przewoziL() {

        System.out.println(marka+ " przewozi maksymalnie " +maxlad);
    }

    public Ciezarowy(String m, String k, int v)
    {
        super(m, k, v);
    }
}
