package home.petprojects.patterns.singleton.ex1;

// singleton as psf field
// It creates after a class initializing
public class Singleton {

    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    // ....
}
