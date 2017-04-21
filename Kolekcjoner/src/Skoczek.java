import java.util.ArrayList;

/**
 * Created by andrew on 21.04.17.
 */
public class Skoczek {

    static int counter;
    int id;

    Skoczek (){
        id = ++counter;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void skacze() {
        System.out.println("Skoczek " + id + " podskakuje");
    }




    public static void main(String args[]){

/*        System.out.println(getCounter());

        Skoczek sk1 = new Skoczek();
        Skoczek sk2 = new Skoczek();
        Skoczek sk3 = new Skoczek();


        System.out.println(sk1.getId());
        System.out.println(sk2.getId());
        System.out.println(sk3.getId());

        System.out.println(getCounter());

        sk1.skacze();
        sk3.skacze();
*/

        ArrayList<Skoczek> skoczki = new ArrayList<Skoczek>();
        for(int i=0; i<5; i++)
            skoczki.add(new Skoczek());

        for(int i=0; i<skoczki.size(); i++) {
            System.out.println(skoczki.get(i).getId());
            skoczki.get(i).skacze();
        }

        System.out.println();

        for(Skoczek a : skoczki) {
            System.out.print(a.getId());      //w for-each nie mozna stosowac .get() ???
            System.out.println(" "+ a);
            a.skacze();
        }




    }



}
