import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println("\nInitial Values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a += b;
        System.out.println("\na += b : " + a);

        a -= b;
        System.out.println("a -= b : " + a);

        a *= b;
        System.out.println("a *= b : " + a);

        a /= b;
        System.out.println("a /= b : " + a);

        a %= b;
        System.out.println("a %= b : " + a);

        sc.close();
    }
}