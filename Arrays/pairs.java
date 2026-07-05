public class pairs {

    public static void pair(int numbers[]) {
        int tp = 0; // counting pair
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];  // 2, 3, 4, 5
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pair: " + tp);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        pair(numbers);
    }
}
