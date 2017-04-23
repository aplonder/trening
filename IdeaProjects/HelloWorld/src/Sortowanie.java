/**
 * Created by andrew on 24.04.17.
 */
public class Sortowanie {

    static void sortuj(int[] tab) {
        int counter = 0;
        do {
            for(int i=0; i<tab.length-1; i++) {
                int tymczasowa = 0;

                if (tab[i] > tab[i+1]) {
                    tymczasowa = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = tymczasowa;
                    for (int s: tab) {System.out.print(s+",");}
                    counter=0;
                    System.out.println();
                    //System.out.println("  "+counter);
                }
                else counter++;
                //System.out.println(counter);
            }
        } while (counter<tab.length-1);

    }


    public static void main (String args[]) {

        int[] tablica = new int[] {2,5,3,8,6};

        sortuj(tablica);


    }



}
