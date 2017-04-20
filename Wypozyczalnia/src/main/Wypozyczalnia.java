package main;

import main.impl.*;

/**
 * Created by root on 09.04.17.
 */
public class Wypozyczalnia {

    public static void main(String args[]) {

        /*main.impl.AbstractSamochod testowypusty = new main.impl.AbstractSamochod();
        testowypusty.info(testowypusty);

        main.impl.AbstractSamochod nowy = new main.impl.AbstractSamochod("renia", "rozowa", 120);
        nowy.info(nowy);
        */

        Osobowy honda = new Osobowy("honda", "czarna", 240, 30, AbstractSamochod.RodzajPaliwa.PB, 5);
        Osobowy BMW = new Osobowy("BMW", "czerwony", 250, 35, AbstractSamochod.RodzajPaliwa.PB, 5);
        Bagazowy VW = new Bagazowy("VW", "srebrny", 200, 20, AbstractSamochod.RodzajPaliwa.LPG, 7);
        Bagazowy transit = new Bagazowy("transit", "niebieski", 130, 15, AbstractSamochod.RodzajPaliwa.LPG, 12);
        Ciezarowy man = new Ciezarowy("man", "bialy", 160, 10, AbstractSamochod.RodzajPaliwa.ON, 100);
        Ciezarowy DAF = new Ciezarowy("DAF", "szary", 170, 5, AbstractSamochod.RodzajPaliwa.ON, 130);

        /*

        System.out.println(honda.getCounter());

        honda.ile(4);
        honda.przewoziMaxOsob();

        DuzyCiezarowy daf = new DuzyCiezarowy("daf", "niebieski", 210);

        VW.przewoziMaxWalizek();
        System.out.println(man);
        System.out.println(honda);

        //System.out.println(main.impl.AbstractSamochod.getCounter());

        System.out.println(man.getCounter());
        */

        System.out.print(honda);
        System.out.print(VW);
        System.out.println(man);

        System.out.print(honda.cecha());
        System.out.print(VW.cecha());
        System.out.println(man.cecha());

        System.out.println(honda.getKolor());

        System.out.println(honda.przyspiesz());         //tak dla sprawdzenia ze obie funkcje zwracaja ta sama wartosc
        System.out.println(honda.przyspiesz());
        System.out.println(honda.getPredkosc());

        honda.setPredkosc(100);
        BMW.setPredkosc(50);
        System.out.println(honda.getPredkosc());
        System.out.println(BMW.getPredkosc());

        honda.setStan(5);
        BMW.setStan(3);
        System.out.println(honda.getStan());
        System.out.println(honda.setStan(4));
        System.out.println(honda.getStan());

        VW.setStan(6);
        transit.setStan(8);
        System.out.println(VW.getStan());
        System.out.println(transit.getStan());

        man.setStan(80);
        DAF.setStan(110);
        System.out.println(man.getStan());
        System.out.println(DAF.getStan());






    }
}
