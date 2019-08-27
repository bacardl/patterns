package home.petprojects.patterns.singleton.ex2;

// Singleton with a static factory
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    // ....
}
