import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        String names[] = new String[size];

        // input
        System.out.println("enter elements: ");
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

        // output
        for (int i = 0; i < names.length; i++) {
            System.out.println("name " + (i + 1) + " is : " + names[i]);
        }

    }

}
