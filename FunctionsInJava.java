import java.util.Scanner;

public class FunctionsInJava {
    static void myWorld(String firstName){
        System.out.println("Hello "+ firstName);
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first name: ");
            String fName = sc.next();
            myWorld(fName);
        } 
        return;
    }   
}


