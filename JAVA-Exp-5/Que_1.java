class student{
    private String name;
    String cla_ss;
    public int id;
    protected int age;
    student(String a, String b, int c, int d){
        name = a;
        cla_ss = b;
        id = c;
        age = d;
    }
}

public class Que_1{
    public static void main(String args[]){
        student a = new student("Yash", "10", 12213128, 16);
        // System.out.println(a.name);  //error becaue private members can't be accesseed outside the class.
        System.out.println("class : " + a.cla_ss); //no error as default members can b accessed outside the class.
        System.out.println("id : " + a.id); //no error as public modifier has the largest scope of all.
        System.out.println("age : " + a.age); //no error as private members are accessible within the same package or subclasses in different packages.
    }
}