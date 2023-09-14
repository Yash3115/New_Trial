class A{
    int a = 10;
    String b = "b";
}

class B{
    int a_ = 20;
    String b_ = "ab";
}

class C extends A{
    int a_ = 30;
}

public class Que_1{
    public static void main(String args[]){
        C a = new C();
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.a_);
    }
}