package testexamples;

public class Test implements TestInterface {
    @Override
    public void eat() {
        System.out.println("eat test method");
        jump();

    }

    static void drink() {
        System.out.println("drink test method");

    }
    public static void main(String[] args) {
        Test testInterface=new Test();


      testInterface.eat();
        testInterface.drink();
        // Using lambda expression
        // to implement Runnable
       // new Thread(() -> System.out.println("New thread created")).start();
        // Using lambda expression
        // to implement Runnable
        int b= 12;
        int a=10;
        //System.out.println((a, b) -> a + b));

     //lambda expression int c=  (a, b) -> a + b;
    }
}
