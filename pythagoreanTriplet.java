import java.util.Scanner;

public class pythagoreanTriplet {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the three numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int max = -1;
            boolean flag = false;
            if(a>b && a>c) {
                max = a;
                if(max*max == (b*b) + (c*c)) {
                    flag = true;
                }
            }
            else if (b>a && b>c) {
                max = b;
                if(max*max == (a*a) + (c*c)) {
                    flag = true;
                }
            }
            else {
                max = c;
                if(max*max == (b*b) + (a*a)) {
                    flag = true;
                }
            }
            if(flag==true) {
                System.out.println("Can form a triangle");
            }
            else{
                System.out.println("Cannot form a triangle");
            }
        }

    }
    
}
