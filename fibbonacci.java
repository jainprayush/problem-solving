import java.util.Scanner;

public class fibbonacci {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value of n: ");
            int n = sc.nextInt();
            int num1 = 0;
            int num2 = 1;
            for(int i=0;i<n;i++) {
                System.out.println(num1);
                int sum = num1 + num2;
                num1 = num2;
                num2 = sum;
            }

        }
        
    }
    
}
