/**
 * Created by root on 09.04.17.
 */
public class Wypozyczalnia {

    public static void main(String args[]) {

        Samochod testowypusty = new Samochod();
        testowypusty.info(testowypusty);

        Samochod nowy = new Samochod("renia", "rozowa", 120);
        nowy.info(nowy);

        Osobowy honda = new Osobowy("honda", "czarna", 240);
        honda.info(honda);

        Bagazowy transporter = new Bagazowy("VW", "srebrny", 200);
        transporter.info(transporter);

        Ciezarowy man = new Ciezarowy("man", "bialy", 160);
        man.info(man);

        honda.doPrzodu();
        man.wPrawo();

        honda.ile(4);
        honda.przewoziO();

        DuzyCiezarowy daf = new DuzyCiezarowy("daf", "niebieski", 210);
        daf.info(daf);

        Osobowy domyslny = new Osobowy();
        domyslny.info(domyslny);

        transporter.przewoziW();

    }
}
