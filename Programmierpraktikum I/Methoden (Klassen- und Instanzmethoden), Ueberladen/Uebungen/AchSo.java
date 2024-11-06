// Aufgabe 3
public class AchSo {
    public static void ach(int i, int[] j) {
        i = i * 2;
        j[0] = i - 2;
        System.out.println("ach: " + i + " " + j[0]);
    }

    public static void so(int[] i, int j) {
        i[0] = i[0] - j;
        j = i[0] * 2;
        System.out.println("so: " + i[0] + " " + j);
    }

    public static void main(String[] args) {
        int[] m = { 5 };
        int[] n = { 7 };
        System.out.println("main: " + m[0] + " " + n[0]); // main: 5 7
        ach(m[0], n); // ach: 10 8
        System.out.println("main: " + m[0] + " " + n[0]); // main: 5 8
        so(m, n[0]); // so: -3 -6
        System.out.println("main: " + m[0] + " " + n[0]); // main -3 8
    }
}
