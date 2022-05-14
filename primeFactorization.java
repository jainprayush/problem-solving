import java.util.Scanner;

public class primeFactorization {

    static void primeNumber(int num) {
        while(num%2 == 0){
            System.out.print("2 ");
            num/=2;
        }
        for(int i=3;i*i<=num;i+=2) {
            if(num%i==0) {
                System.out.print(i + " ");
                num = num/i;
            }
        }
        if(num!=1){
            System.out.print(num);
        }
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            primeNumber(num);
        }

    }
    
}
