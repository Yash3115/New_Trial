import java.util.Scanner;

public class Que_1{
    public static void compare_string(String a, String b){
        System.out.println("The result of a == b is " + (a==b));
        System.out.println("The result of a != b is " + (a!=b));
        System.out.println("The result of a.equals(b) is " + a.equals(b));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string :-");
        String a = sc.next();
        
        System.out.println("Enter the second string :-");
        String b = sc.next();

        compare_string(a, b);
        sc.close();
    }
}