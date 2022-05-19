import java.util.Scanner;

public class pattern3 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n: ");
            int num = sc.nextInt();
            for(int i=1;i<=num;i++){
                for(int j=1;j<=num-i;j++) {
                    System.out.print(" ");
                }
                for(int j=num-i;j<num;j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
    }
    
}
