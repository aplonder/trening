/**
 * Created by root on 17.03.17.
 */

class FreshJuice {
    enum FreshJuiceSize { SMALL, MEDIUM, LARGE }
    FreshJuiceSize size;
}


public class FreshJuiceTest {

    public static void main(String args[]) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("Size: " + juice.size);

        Puppy fad = new Puppy("imie");

        ClassicSingleton.getInstance();
        ClassicSingleton.getInstance();
        ClassicSingleton.getInstance();
        Singleton.getInstance();
        Singleton.getInstance();
        Singleton.getInstance();
    }

}
