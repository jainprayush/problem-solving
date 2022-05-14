import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number:");
            int a=sc.nextInt();
            System.out.println("Enter second number:");
            int b=sc.nextInt();
            int temp = a;
            a=b;
            b=temp;
            System.out.println("Swapper numbers are: "+a+" and"+ b);
        }

    }
    
}
