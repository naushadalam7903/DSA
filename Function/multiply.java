import java.util.Scanner;

public class multiply {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        int result = multiply(num1, num2);
        System.out.println("Product: " + result);
        sc.close();
    }
}
