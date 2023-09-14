class student{
    String name;
    int standard;
    int age;
    String gender;
    public student(){
        this("Yash",10,16,"male");
    }
    
    public student(String a, int b, int c, String d){
        this.name = a;
        this.standard = b;
        this.age = c;
        this.gender = "male";
    }
    public void info(){
        System.out.println("Name :" + name);
        System.out.println("Standard :" + standard);
        System.out.println("Age :" + age);
        System.out.println("Gender :" + gender);
    }
}


public class Que_3 {
    public static void main(String args[]){
        student a = new student();
        a.info();
    }
}
