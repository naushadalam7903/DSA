import java.util.Scanner;

public class marksInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Now enter value: ");

        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Array elments are: ");
        // output
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i]);
            if (i < size - 1) {
                System.out.print(", ");
            } 
        }

    }
}