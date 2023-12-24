package Practice;

public class Inheritance extends Play{


    public Inheritance() {
        super("ahmed");


    }

    public static void main (String [] args) {
new Inheritance().inhTest();
inhTest("a");

    }



    @Override
    public void inhTest() {
        System.out.println("bew bew");
    }
}
