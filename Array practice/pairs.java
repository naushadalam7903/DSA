public class pairs {

    public static void printPairs(int num[]) {
        int totalPair = 0;
        for (int i = 0; i < num.length; i++) {
            int curr = num[i];
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + curr + "," + num[j] + ") ");
                totalPair++;
            }
            System.out.println();
        }
        System.out.print("Total Pairs = " + totalPair); // tp = n(n-1)/2
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printPairs(arr);
    }
}
