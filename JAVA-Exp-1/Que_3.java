import java.util.Scanner;
public class Que_3 {
    public static void main(String args[]){
        System.out.println("Enter the numbers of test cases :-");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the test cases :-");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j < size; j++){
            switch(arr[j]){
                case 1:
                System.out.println("Case 1 is selected");
                break;
                case 2:
                System.out.println("Case 2 is selected");
                break;
                case 3:
                System.out.println("Case 3 is selected");
                break;
                case 4:
                System.out.println("Case 4 is selected");
                break;
                case 5:
                System.out.println("Case 5 is selected");
                break;
                case 6:
                System.out.println("Case 6 is selected");
                break;
                case 7:
                System.out.println("Case 7 is selected");
                break;
                case 8:
                System.out.println("Case 8 is selected");
                break;
                case 9:
                System.out.println("Case 9 is selected");
                break;
                case 10:
                System.out.println("Case 10 is selected");
                break;
                default:
                System.out.println("Invalid case");
            }
        }
        sc.close(); 

    }
}
