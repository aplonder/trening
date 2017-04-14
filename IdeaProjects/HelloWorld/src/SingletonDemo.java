/**
 * Created by root on 18.03.17.
 */
public class SingletonDemo {

    public static void main (String[] args) {
        Singleton tmp = Singleton.getInstance();
        tmp.demoMethod();

        ClassicSingleton test = ClassicSingleton.getInstance();
    }
}
