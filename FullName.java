import java.util.Scanner;

public class FullName {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first name: ");
            String firstName = sc.next();
            System.out.println("Enter last name: ");
            String lastName = sc.next();
            String fullName = firstName + lastName;
            System.out.println(fullName);
        }
    }
}

