public class linerSearch {
    public static int getLargest(int num[]) {
        int largest = Integer.MIN_VALUE; // -infinity

        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int marks[] = { 4, 8, 2, 3, 12, 7 };
        System.out.println(getLargest(marks));
    }
}