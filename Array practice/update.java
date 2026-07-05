public class update {

    public static void update(int marks[]) {
        // this loop is for traversing 
        for (int i = 0; i < marks.length; i++) { 
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 32, 24, 49 };

        update(marks);
        // print marks  
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
