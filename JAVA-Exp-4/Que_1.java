class student{
    static String name = "First";
    static{
        String k = "Second";
        student.print(k);
    }
    static void print(String k){
        System.out.println(k);
        System.out.println(name);
    }
}
public class Que_1{

    public static void main(String args[]){
        student a = new student();
    }
}