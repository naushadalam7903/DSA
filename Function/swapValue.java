public class swapValue {

    public static void swap(int a, int b) {

        // swap
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        swap(num1, num2);
        System.out.println("a = " + num1);
        System.out.println("b = " + num2);

    }
}