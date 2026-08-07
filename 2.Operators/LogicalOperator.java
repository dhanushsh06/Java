import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.println("\nLogical AND (&&)");
        System.out.println("(a > 0 && b > 0) = " + (a > 0 && b > 0));
        System.out.println("(a > b && b > 0) = " + (a > b && b > 0));

        System.out.println("\nLogical OR (||)");
        System.out.println("(a > 0 || b > 0) = " + (a > 0 || b > 0));
        System.out.println("(a > b || b > 0) = " + (a > b || b > 0));

        System.out.println("\nLogical NOT (!)");
        System.out.println("!(a > b) = " + !(a > b));
        System.out.println("!(a < b) = " + !(a < b));

        input.close();
    }
}