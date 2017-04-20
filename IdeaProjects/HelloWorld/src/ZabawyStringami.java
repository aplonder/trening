import java.util.*;

/**
 * Created by andrew on 20.04.17.
 */
public class ZabawyStringami {

    public static void main(String[] args) {

        String textStaly = "edyta";
        System.out.println(textStaly);

        System.out.print("Podaj tekst: ");
        Scanner user_input = new Scanner(System.in);
        String zKlawiatury = user_input.next();
        System.out.println();

        String reverseStaly = new StringBuffer(textStaly).reverse().toString();
        System.out.println(reverseStaly); // przy urzyciu buffer

        String reverseZKlawiatury = new StringBuilder(zKlawiatury).reverse().toString();
        System.out.println(reverseZKlawiatury);  // przy urzyciu builder

        String doSprawdzenia = "aaaaaaaaabaa";
        String wynik = "dopiero bedzie";

        for(int i=0; i<doSprawdzenia.length()/2; i++ ) {
            System.out.println("porownujemy ("+ (doSprawdzenia.charAt(0+i) ) +") z ("+ (doSprawdzenia.charAt(doSprawdzenia.length()-1 -i)) +")");
            if ((doSprawdzenia.charAt(0+i) ) == (doSprawdzenia.charAt(doSprawdzenia.length()-1 -i)))
                wynik = "TAK :)";
            else
                {
                wynik = "NIE :(";
                break;
                }
        }

        System.out.println("Czy słowo (" + doSprawdzenia + ") jest palindromem? " + wynik );

    }
}
