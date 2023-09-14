class Fl_oat{
    float num = 4.0f;
}
public class Que_1 {
    public static void main(String args[]){
        Fl_oat a = new Fl_oat();
        Fl_oat b = a;
        b.num = 9.9f; //As b and a refers to the same object a.num will also return 9.9f
        System.out.println("The value of a.num is " + a.num);
        System.out.println("The value of b.num is "+b.num);
    }
}