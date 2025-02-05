package testexamples;

public interface TestInterface {
    int i = 0;

    void eat();

    static void drink() {
        System.out.println("drink inteface method");
    }

    default void jump() {
        System.out.println("jump interface method");
    }

}