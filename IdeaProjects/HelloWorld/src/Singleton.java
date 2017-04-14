/**
 * Created by root on 18.03.17.
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private  Singleton() { }

    public static Singleton getInstance () {
        return singleton;

    }

    protected static void demoMethod() {
        System.out.println("demoMethod for sinfleton");
    }

}
