import java.util.Scanner;

public class forLoop {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int x = sc.nextInt();
            for(int i=0;i<x;i++){
                System.out.println(i);
            }
        }
    }
}



