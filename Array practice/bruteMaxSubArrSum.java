public class bruteMaxSubArrSum {
    // using brute method to find every possible subarray and calculate its sum.

    public static void maxSubArrSum(int number[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < number.length; start++) {

            for (int end = start; end < number.length; end++) {                
                int sum = 0; // calculating sum of all subArray

                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                    sum += number[k];
                }
                if (maxSum < sum) {
                    maxSum = sum;
                }
                System.out.print("= " + sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Max sub array sum = " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        maxSubArrSum(arr);
    }
}