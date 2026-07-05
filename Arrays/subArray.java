public class subArray {

    public static void printSubArray(int numbers[]) {
        int ts = 0;
        // Outer loop for starting point
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            // Inner loop for ending point - start from 'i'
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                // Loop to print elements from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println(); // Move to next line after one subarray
            }
        }
        System.out.println("Total subarrays: " + ts);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printSubArray(arr);
    }
}