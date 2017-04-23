package main;
import main.impl.*;

/**
 * Created by andrew on 23.04.17.
 */
public class Obliczenia {


    public static void main (String []args) {

        Figura f1 = new Prostokat(2,5);
        Figura f2 = new Kolo(2);
        Figura f3 = new Prostokat(2,4);
        Figura f4 = new Prostokat(2,5);

        System.out.println(f1.equals(f2));
        System.out.println(f1.equals(f3));
        System.out.println(f1.equals(f4));





    }

}
