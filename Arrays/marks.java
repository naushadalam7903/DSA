public class marks {
    public static void main(String[] args) {

        int[] marks = new int[8];
        marks[0] = 87; // che
        marks[1] = 74; // phy
        marks[2] = 92; // english
        marks[3] = 98; // hindi
        marks[4] = 67; // maths
        marks[5] = 84; // networking
        marks[6] = 59; // workshop
        marks[7] = 82; // computer

        System.out.println(marks[1]);

        for (int i = 1; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}