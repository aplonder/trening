import java.util.*;

/**
 * Created by andrew on 21.04.17.
 */
public class Generator {

    static int counter = 0;
    static String imie = "afdfa";

    static int getCounter() {
        return counter;
    }

    static Collection fill (Collection<String> collection) {
        for (int i=0; i <3; i++)
            collection.add(next());
        return collection;
    }



    public static String next() {
        //String imie ="";
        switch (counter) {
            case 0 : imie = "Edyta"; counter++; break;
            case 1 : imie = "Ania" ; counter++; break;
            case 2 : imie = "Marta" ; counter++; break;
            case 3 : imie = "Kasia" ; counter++; break;
            case 4 : imie = "Agnieszka" ; counter=0; break;
        }
        return counter + " " + imie;
    }


    public static void main (String args[]) {

/*        System.out.println(getCounter());

        System.out.println(next());
        System.out.println(getCounter());
*/

        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));


    }


}
