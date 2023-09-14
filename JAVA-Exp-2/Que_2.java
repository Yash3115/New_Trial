class Dog {
    String name;
    String say;

    public Dog(String a, String b) {
        name = a;
        say = b;
    }

    public void info() {
        System.out.println("The name of the dog is " + name + " and it says " + say);
    }
}
public class Que_2 {
    public static void main(String args[]) {
        Dog a = new Dog("Spot", "Ruff!");
        Dog b = new Dog("Scruffy", "Wurf!");
        a.info();
        b.info();

        // creating a new dog reference and assign it to spot's object.
        Dog c = b;

        // Testing === and equals for all references.
        System.out.println("The result of a==b is " + String.valueOf(a==b));
        System.out.println("The result of b==c is " + String.valueOf(b==c));
        System.out.println("The result of c==a is " + String.valueOf(c==a));
        
        System.out.println("The result of a.equals(b) is " + a.equals(b));
        System.out.println("The result of b.equals(c) is " + b.equals(c));
        System.out.println("The result of c.equals(a) is " + c.equals(a));
    }
}
