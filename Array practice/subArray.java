public class subArray {

    public static void printSubArray(int number[]) {

        int totalSubArrays = 0;

        // starting point
        for (int start = 0; start < number.length; start++) {

            // ending point
            for (int end = start; end < number.length; end++) {

                int sum = 0;

                // print elements from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                    sum += number[k];
                }

                System.out.println("= " + sum);
                totalSubArrays++;
            }

            System.out.println();
        }

        System.out.println("Total Subarrays: " + totalSubArrays);
    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 8, 10 };

        printSubArray(arr);
    }
}