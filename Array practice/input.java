import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        int marks[] = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phy marks: ");
        marks[0] = sc.nextInt();
        System.out.print("Enter chemistry marks: ");
        marks[1] = sc.nextInt();
        System.out.print("Enter maths marks: ");
        marks[2] = sc.nextInt();

        // marks[2] = marks[2] + 1;
        System.out.println("phy: " + marks[0]);
        System.out.println("chemistry: " + marks[1]);
        System.out.println("maths: " + marks[2]);

        int percentage = marks[0] + marks[1] + marks[2] / 3;
        System.out.println("percentage = " + percentage + "%");

        sc.close();

    }
}
