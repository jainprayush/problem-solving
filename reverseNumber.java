import java.util.Scanner;

public class reverseNumber {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int digit = sc.nextInt();
            String str = Integer.toString(digit);
            for(int i=str.length()-1;i>=0;i--){
                System.out.println(str.charAt(i));
            }
        }
    }
    
}
