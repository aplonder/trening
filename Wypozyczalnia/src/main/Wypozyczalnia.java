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
        Osobowy honda = new Osobowy("honda", "czarna", 240);

        System.out.println(honda);

        Bagazowy transporter = new Bagazowy("VW", "srebrny", 200);

        Ciezarowy man = new Ciezarowy("man", "bialy", 160);

        honda.doPrzodu();
        man.wPrawo();
        System.out.println(honda.getCounter());
        honda.ile(4);
        honda.przewoziO();

        DuzyCiezarowy daf = new DuzyCiezarowy("daf", "niebieski", 210);

        transporter.przewoziW();
        System.out.println(man);
        System.out.println(honda);

        //System.out.println(main.impl.AbstractSamochod.getCounter());

        System.out.println(man.getCounter());





    }
}
