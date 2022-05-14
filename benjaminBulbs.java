import java.util.Scanner;

public class benjaminBulbs {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of the bulbs: ");
            int num = sc.nextInt();
            for(int i=1;i*i<=num;i++){
                System.out.println(i*i);
            }
        }
        }
    
}
