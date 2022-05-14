import java.util.Scanner;

public class pattern2 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n: ");
            int num = sc.nextInt();
            for(int i=num;i>0;i--) {
                for(int j=1;j<=i;j++) {
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }
    }
    
}
