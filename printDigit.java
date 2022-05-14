import java.util.Scanner;

public class printDigit {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter digit: ");
            int digit = sc.nextInt();
            String str = Integer.toString(digit);
            for(int i=0;i<str.length();i++){
                System.out.println(str.charAt(i));
            }
        }
        
    }
    
}
