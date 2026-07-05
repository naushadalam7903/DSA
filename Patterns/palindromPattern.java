public class palindromPattern {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            // print space - 1st part
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print number - 2nd part 
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            // print 3rd part number 
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
