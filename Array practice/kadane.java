public class kadane {

    public static void kadanes(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {

            // handles all cases, including arrays with all negative numbers.
            currSum = Math.max(number[i], currSum + number[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.print("Maximum sub array sum: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // int arr[] = { -2, -5, -1, -8 };
        kadanes(arr);
    }
}
