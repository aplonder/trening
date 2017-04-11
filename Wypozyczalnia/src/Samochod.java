/**
 * Created by root on 09.04.17.
 */
class Samochod {

    protected String marka;
    protected String kolor;
    int maxv;

    protected void doprzodu() {
        System.out.println(marka+ " jedzie do przodu.\n");
    }

    protected void dotylu() {
        System.out.println(marka+ " jedzie do tylu.\n");
    }

    protected void wlewo() {
        System.out.println(marka+ " skreca w lewo.\n");
    }

    protected void wprawo() { System.out.println(marka+ " skreca w prawo.\n"); }

    protected void info(Samochod s) {
        System.out.println("Marka: " +s.marka);
        System.out.println("Kolor: " +s.kolor);
        System.out.println("Maksymalna predkosc: " +s.maxv + "\n");

    }

    Samochod() {
        marka = "nieznana" ;
        kolor = "nieznany" ;
        maxv = 0 ;
    }


    Samochod( String m, String k, int v) {
        marka = m ;
        kolor = k ;
        maxv = v ;
    }
}
