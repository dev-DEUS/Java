public class Methoden {

    /* *** Aufgabenteil (a) *** */

    public static boolean mehrheit(boolean v1, boolean v2, boolean v3) {
        if (v1 && v2 || v2 && v3 || v1 && v3) {
            return true;
        } else {
            return false;
        }
    }

    public static void testMehrheit() {
        boolean[] werte = { true, false };
        for (int i = 0; i < werte.length; i++) {
            for (int j = 0; j < werte.length; j++) {
                for (int k = 0; k < werte.length; k++) {
                    if (mehrheit(werte[i], werte[j], werte[k])) {
                        System.out.println("v1 = " + werte[i] + "  v2 = " + werte[j] + "  v3 = " + werte[k]);
                    }
                }
            }
        }

        /*
        for (boolean i : werte) {
            for (boolean j : werte) {
                for (boolean k : werte) {
                    if (mehrheit(i, j, k)) {
                        System.out.println("v1 = " + i + "  v2 = " + j + "  v3 = " + k);
                    }
                }
            }
        } */
       
    }

    /* *** Aufgabenteil (b) *** */

    public static boolean monoton(int[] n) {
        int temp = 0;
        boolean ergebnis = false;
        for (int i = 0; i < n.length; i++) {
            if (temp <= n[i]) {
                ergebnis = true;
            } else {
                ergebnis = false;
            }
            temp = n[i];
        }
        return ergebnis;
    }

    public static void testMonoton() {
        int[] a = { -1, 0, 1 };
        int[] b = { 2, 2, 2, 2 };
        int[] c = { -1, -2, -3 };
        int[] d = { 3, 2 };
        int[] e = { 0 };

        int[][] felder = { a, b, c, d, e };

        for (int i = 0; i < felder.length; i++) {
            System.out.print("Die Folge ");
            for (int j = 0; j < felder[i].length; j++) {
                System.out.print(felder[i][j] + " ");
            }
            if (monoton(felder[i])) {
                System.out.print(" steigt monoton.");
            } else {
                System.out.print(" steigt nicht monoton.");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        testMehrheit();
        testMonoton();
    }
}
