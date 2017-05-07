/**
 * Created by root on 18.03.17.
 */
public class ClassicSingleton {

    private static ClassicSingleton instance = null;
    private ClassicSingleton() {
        // Exists only to defeat instantiation.
    }

    public static ClassicSingleton getInstance() {
        if(instance == null) {
            instance = new ClassicSingleton();
            System.out.println("ClassicSingleton has been created");
        }
        return instance;

    }

    public static void main(String[] args) {

    ClassicSingleton pierwszy = new ClassicSingleton();
    ClassicSingleton drugi = new ClassicSingleton();





    }

}
