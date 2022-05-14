import java.util.Scanner;

public class gcdLCM {

    static int gcd(int num1, int num2) {
        if (num2==0) {
            return num1;
        }
        else {
            return gcd(num2, num1%num2);
        }
    }

    static int lcm(int num1, int num2, int gcdValue) {
        return Math.abs(num1 * num2) / gcdValue;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number 1:");
            int num1 = sc.nextInt();
            System.out.println("Enter number 2:");
            int num2 = sc.nextInt();
            int gcdValue = gcd(num1, num2);
            int lcmValue = lcm(num1, num2, gcdValue);
            System.out.println("GCD and LCM of "+ num1 + " "+ num2 + " are "+ gcdValue + " and "+lcmValue + " respectively");
        }

    }
    
}
