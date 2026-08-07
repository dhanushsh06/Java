import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args){
        Scanner op = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = op.nextInt();
        System.out.print("Enter value of b: ");
        int b = op.nextInt();
        System.out.println("Addition: "+(a + b));
        System.out.println("Subtraction: "+(a - b));
        System.out.println("Multiplication: "+(a * b));
        System.out.println("Division: "+(a / b));
        System.out.println("Modulus:"+(a % b));
    }
}