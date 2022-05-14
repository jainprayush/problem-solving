import java.util.Scanner;

public class pattern1 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n: ");
            int num = sc.nextInt();
            for (int i=1;i<=num;i++) {
                for(int j=1;j<=i;j++) {
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }
    }
    
}
