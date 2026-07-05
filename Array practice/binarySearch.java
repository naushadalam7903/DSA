public class binarySearch {

    public static int binSearch(int arr[], int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                // System.out.println("target at index: " + mid);
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int num[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        System.out.println("target at index: " + binSearch(num, 80));
    }
}