import java.util.Scanner;

public class intAndStringInput {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = Integer.parseInt(sc.nextLine ());
            String name = sc.nextLine();
            System.out.println(n + name);
        }
    }
    
}
