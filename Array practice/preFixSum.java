public class preFixSum {
    // To calculate Max sub array sum

    public static void maxSubArrSum(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // creating new prefix array
        int prefix[] = new int[number.length];
        prefix[0] = number[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i]; // formula to calculate prefix sum
        }

        for (int start = 0; start < number.length; start++) {

            for (int end = start; end < number.length; end++) {
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }
        }
        System.out.print("Sum of Maximum sub array is: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        maxSubArrSum(arr);
    }
}
