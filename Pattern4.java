import java.util.Scanner;

public class Pattern4 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n:");
            int num = sc.nextInt();
            for(int i=num;i>0;i--){
                for(int j = 0;j<i;j++){
                    System.out.print(" "); 
                }
                for(int j=i;j<num;j++ ){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    
}
