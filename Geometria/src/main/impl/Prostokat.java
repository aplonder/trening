package main.impl;
import main.Figura;
/**
 * Created by andrew on 23.04.17.
 */

public class Prostokat implements Figura {

    private double a;
    private double b;
    private double pole =0;

    public Prostokat (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getPole() {
        return pole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Prostokat prostokat = (Prostokat) o;

        if (Double.compare(prostokat.a, a) != 0) return false;
        return (Double.compare(prostokat.b, b) != 0);
    }
/*
    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(a);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(pole);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
*/
    @Override
    public double obliczPole() {
       if(pole==0)
           pole = a*b;
        return pole;
    }
}
