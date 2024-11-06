public class Rekursion2 {

    /* *** Aufgabenteil (a) *** */
    public static int quadratRek(int a) {
        if (a == 1) {
            return 1; // Fuer den Fall 1^(2) = 1
        } else {
            return quadratRek(a - 1) + 2 * a - 1;
        }
    }

    /* *** Aufgabenteil (b) *** */

    public static int treppen(int n, String s) {
        int summe = 0;
        if (n == 0) {
            System.out.print(s);
            System.out.println();
            return 1;
        } else if (n == 1) {
            System.out.print(s + "-1");
            System.out.println();
            return 1;
        } else {
            summe += treppen(n - 1, s + "-1");
            summe += treppen(n - 2, s + "-2");
            return summe;
        }
    }

    /* *** Aufgabenteil (c) *** */
    public static int naechstesElement(int a_i) {
        if (a_i % 2 == 0) {
            return a_i / 2;
        } else {
            return 3 * a_i + 1;
        }
    }

    public static void collatz(int a, int count) {
        if (a == 1) {
            System.out.println("1");
            System.out.println("Laenge der Folge: " + count);
        } else {
            System.out.print(a + " ");
            collatz(naechstesElement(a), count += 1);
        }
    }

    public static void main(String[] args) {

        /* *** Test Aufgabenteil (a) *** */
        System.out.println("(a)");
        int z;
        do {
            z = IOTools.readInteger("z = ");
        } while (z < 0);
        System.out.println("z^2 = " + quadratRek(z));

        /* *** Test Aufgabenteil (b) *** */
        System.out.println("\n(b)");
        int n = IOTools.readInteger("n = ");
        int count = treppen(n, "");
        System.out.println("Anzahl der Möglichkeiten: " + count);

        /* *** Test Aufgabenteil (c) *** */
        System.out.println("\n(c)");
        int a0 = IOTools.readInteger("a_0 = ");
        collatz(a0, 1);

    }
}
