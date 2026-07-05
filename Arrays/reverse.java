public class reverse {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int left = 0, right = arr.length - 1;

        // display original array
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // swaping elements
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.print("\nReverse Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
