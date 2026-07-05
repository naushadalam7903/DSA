import java.util.Scanner;

public class Question {
    // Q-take an array as input from the user. Search for a given number x and print
    // the index at which it occurs.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");

        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter array element: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter value to search: ");
        int search = sc.nextInt();

        boolean found = false;

        // traversing the array
        for (int j = 0; j < size; j++) {
            if (numbers[j] == search) {
                System.out.print("Index of element is " + j);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found .. ");
        }

    }
}
