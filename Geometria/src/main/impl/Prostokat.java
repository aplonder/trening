package main.impl;
import main.Figura;
/**
 * Created by andrew on 23.04.17.
 */

public class Prostokat implements Figura {

    double a;
    double b;
    double pole;

    public Prostokat (int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Prostokat prostokat = (Prostokat) o;

        if (Double.compare(prostokat.a, a) != 0) return false;
        if (Double.compare(prostokat.b, b) != 0) return false;
        return Double.compare(prostokat.pole, pole) == 0;
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
        pole = a*b;
        return pole;
    }
}
