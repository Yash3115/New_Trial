class Dog{
    public void bark(int x){
        System.out.println("Bark !");
    }
    public void bark(float y){
        System.out.println("Wurf !");
        
    }
    public void bark(boolean z){
        System.out.println("Bow bow !");

    }
}


public class Que_1{
    public static void main(String args[]){
        Dog tommy = new Dog();
        tommy.bark(5);
        tommy.bark(5.4f);
        tommy.bark(true);
    }
}