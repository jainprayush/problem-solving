import java.util.Scanner;

public class rotateNumber {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the digit: ");
            int num = sc.nextInt();
            System.out.println("Enter the k rotating value:");
            int k = sc.nextInt();
            String str = Integer.toString(num);
            int length = str.length();
            k = ((k%length) + length) % length;
            
            int d = (int)(Math.pow(10,k));
            int div = num / d;
            int rem = num % d;
            int rotate = rem * (int)(Math.pow(10,(length-k))) + div;
            System.out.println(rotate);
        }

    }
    
}
