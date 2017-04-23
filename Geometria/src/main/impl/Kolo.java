package main.impl;
import main.Figura;
/**
 * Created by andrew on 23.04.17.
 */
public class Kolo implements Figura {

    double r;
    double pole;

    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kolo kolo = (Kolo) o;

        if (Double.compare(kolo.r, r) != 0) return false;
        return Double.compare(kolo.pole, pole) == 0;
    }

/*    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(r);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(pole);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
*/
    @Override
    public double obliczPole() {
        pole = r*r*3.14;
        return pole;
    }
}
