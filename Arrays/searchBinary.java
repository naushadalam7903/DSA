public class searchBinary {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int start = 0, end = arr.length - 1;

        int target = 30; 

        while (start <= end) {
            int mid = (start + end) / 2; // mid = (0+7)/2 = 3

            // comparisons
            if (arr[mid] == target) {
                System.out.print("Target at Index " + mid);
                return;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        System.out.println("Target not found");

    }

}
