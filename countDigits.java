import java.util.Scanner;

public class countDigits {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter digit: ");
            int digit = sc.nextInt();
            int count = 0;
            while(digit!=0) {
                count++;
                digit/=10;
            }
            System.out.println(count);

        }
    }
    
}
