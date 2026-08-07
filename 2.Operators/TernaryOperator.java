import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = input.nextInt();
        System.out.print("Enter value of b: ");
        int b = input.nextInt();
    
        int max = (a > b)? a : b;
        System.out.println("Maximum Value is: " +max);
        input.close();
    }
}
