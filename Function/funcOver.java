public class funcOver {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;

    }

    public static int integer(int a, int b) {
        return a + b;
    }

    public static float decimal(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        // System.out.println(sum(3, 3));
        // System.out.println(sum(2, 2, 2));

        System.out.println(integer(2, 3));
        System.out.println(decimal(2.5f, 2.3f));
    }
}
