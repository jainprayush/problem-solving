import java.util.Scanner;

public class AddNumbers {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter num1: ");
            int num1 = sc.nextInt();
            System.out.println("Enter num2: ");
            int num2 = sc.nextInt();
            int add = num1 + num2;
            System.out.print("Sum of 2 numbers is: "+add);
        }
    }
}


