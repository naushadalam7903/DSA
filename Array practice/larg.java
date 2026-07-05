import java.util.Scanner;

public class larg {

    public static int getLargest(int num[]) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int number[] = new int[size];
        System.out.print("enter array element: ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println("smallest num = " + getLargest(number));
        sc.close();
    }
}
