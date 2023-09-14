import java.util.Scanner;
public class Que_2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want to find prime number :-");
        int a = sc.nextInt();
        int i, j;
        System.out.println("The prime numbers are :-");
        for(i = 2; i <= a; i++){
            for(j = 2; j < i; j++){
                if(i % j == 0){
                    break;
                }
            }
            if(j == i){
                System.out.println(i);
            }
        }
        sc.close();
    }
}