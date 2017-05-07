import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by andrew on 24.04.17.
 */
public class Pet {

    public static int counter = 0;
    public  String nazwa = "fafadf";


    public Pet () {
        this.nazwa=next();
    }


    public String next() {

        switch (counter) {
            case 0 : nazwa = "Wydra"; counter++; break;
            case 1 : nazwa = "Ryjowka" ; counter++; break;
            case 2 : nazwa = "Los" ; counter++; break;
            case 3 : nazwa = "Jezozwierz" ; counter++; break;
            case 4 : nazwa = "Kaczka" ; counter=0; break;
        }
        return nazwa;
    }

    public static void wypelnij (Pet[] p) {

        for(int i=0; i<p.length; i++) {
            p[i] = new Pet();
        }

        return;

    }

    @Override
    public String toString() {
        return nazwa;
    }

    public static void main(String[] args) {

        Pet[] pets = new Pet[7];
        wypelnij(pets);
        List<Pet> zwierzeta = new ArrayList<>();
        for (Pet s: pets) { zwierzeta.add(s); System.out.println(s);}


        System.out.println(zwierzeta);

        List<Pet> sub = zwierzeta.subList(2,5);
        System.out.println(sub);

        zwierzeta.removeAll(sub);
        System.out.println(zwierzeta);

//        zwierzeta.remove(6);
       // zwierzeta.remove("Wydra");
        System.out.println(zwierzeta);

        }
    }

