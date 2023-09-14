class student{
    String name = "yash";
    int age = 19;
}

public class Que_2 {
    public static void main(String args[]){
        student a = new student();
        System.out.println("The name of the student is "+a.name);
        System.out.println("The age of the student is "+a.age);
        System.out.println("As there is no error in the programme we can say that default constructor is automatically synthesised");
    }
}
