public class test {
    public static void main(String[] args) {
        // printing solid pattern

        int n = 4;
        int m = 5;
        System.out.println("---- printing solid pattern 4x5 ------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}