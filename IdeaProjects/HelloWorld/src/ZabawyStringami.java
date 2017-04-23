import java.util.*;

/**
 * Created by andrew on 20.04.17.
 */
public class ZabawyStringami {

    //static String textStaly = "edyta";        //statyczne poniewaz wywolujemy bezposrednio (nie trzeba tworzyc obiektu)
    //static String zKlawiatury = "";
    static String obrucony = "";                //zostawiono na potrzeby "recznego" wypisania
    //static String st = "aaaaaaaaabaa";
    //static String wynik = "dopiero bedzie";

    static String wprowodz(){
        System.out.print("Podaj tekst: ");
        Scanner user_input = new Scanner(System.in);
        // String zKlawiatury = user_input.next();
        return /*zKlawiatury =*/ user_input.next();
    };

    static String obroc(String s){
        // String obrucony = new StringBuilder(s).reverse().toString();
        return new StringBuilder(s).reverse().toString();
    };

    static void sprawdzPalidrom(String st) {
        // String wynik = "zaraz bedzie";
        boolean wynikBool = false;
        for(int i = 0; i< st.length()/2; i++ ) {
            System.out.println("porownujemy ("+ (st.charAt(i) ) +") z ("+ (st.charAt(st.length()-1 -i)) +")");

            if ((st.charAt(i) ) == (st.charAt(st.length()-1 -i)))
                //wynik = "TAK :)";
                wynikBool = true;
            else {
                //wynik = "NIE :(";
                wynikBool = false;
                break;
            }
        }

        if (wynikBool)
            System.out.println("Wyraz (" + st + ") JEST palidromem :) ");
        else
            System.out.println("Wyraz (" + st + ") NIE jest palidromem :( ");
        //System.out.println("Czy słowo (" + st + ") jest palindromem? " + wynik );
        //return wynik;
    }

    public static void main(String[] args) {

        //System.out.println(textStaly);
        //ZabawyStringami.wprowodz();
        //System.out.println(zKlawiatury);

        System.out.println(wprowodz());                 //sprawdzenie skutecznosci wprowadzania tekstu

        String obr = obroc("pralka");           //prawidlowa forma - przerobic reszte!!!!!
        System.out.println(obr);

        System.out.println(obroc("telefon"));           //obrocenie ustalonego stringa
        System.out.println(obroc(wprowodz()));             //obrocenie tekstu z klawiatury

        sprawdzPalidrom("tyryt");
        String input = wprowodz();
        //sprawdzenie ustalonego stringa (print umieszczono juz w metodzie)
        sprawdzPalidrom(input);                   //sprawdzenie tekstu z klawiatury (print umieszczono juz w metodzie)



/*        System.out.print("Podaj tekst: ");
        Scanner user_input = new Scanner(System.in);
        String zKlawiatury = user_input.next();
        System.out.println();

        String reverseStaly = new StringBuffer(textStaly).reverse().toString();
        System.out.println(reverseStaly); // przy urzyciu buffer

        String reverseZKlawiatury = new StringBuilder(zKlawiatury).reverse().toString();
        System.out.println(reverseZKlawiatury);  // przy urzyciu builder




        char[] chars = st.toCharArray(); //new char[];

        for (char x: chars) {
            System.out.println(x);

        }

        List<String> sts = new ArrayList<>();

        for (String st :sts) {
            sts.remove(st);
        }
*/
// listy, mapy, kolekcje, equals (do wypozyczalni), stringbuffer vs string, iteratory


    }
}
