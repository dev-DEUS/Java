
public class Aufgabe_3_1 {

    // Methode fuellt das Feld mit Zufallszahlen aus derm Intervall [1,100]
    public static void fillRand(int[] feld) {
        for (int i = 0; i < feld.length; i++) {
            feld[i] = (int) (Math.random() * 100) + 1;
        }
    }

    public static void main(String[] args) {
        int[] feld = new int[10];
        fillRand(feld);

        int gerade = 0, ungerade = 0,
                differenz = 0,
                feld1 = 0, feld2 = 0;

        /* *** Aufgabenteil (a) *** */
        // 1.5
        for (int i = 0; i < feld.length; i++) {
            if (i < feld.length - 1) {
                System.out.print(feld[i] + "-");
            } else {
                System.out.print(feld[i]);
            }

            /* *** Aufgabenteil (b) *** */
            // 3
            if (feld[i] % 2 == 0) {
                gerade++;
            } else {
                ungerade++;
            }

            if (i == feld.length - 1) { // Wird erst ausgefuehrt, wenn gerade und ungerade vollstaendig ermittelt wurden
                System.out.println();
                if (gerade > ungerade) {
                    differenz = gerade - ungerade;
                    System.out.println("Das Feld enthaelt " + differenz + " gerade Zahlen mehr als ungerade Zahlen.");
                } else if (gerade < ungerade) {
                    differenz = ungerade - gerade;
                    System.out.println("Das Feld enthaelt " + differenz + " ungerade Zahlen mehr als gerade Zahlen.");
                } else {
                    System.out.println("Das Feld enthaelt gleich viele geraden und ungeraden Felder.");
                }
            }
        }
        /* *** Aufgabenteil (c) *** */
        // 2.5
        int maxDiff = 0;
        for (int k = 0; k < feld.length - 1; k++) {
            differenz = Math.abs(feld[k] - feld[k + 1]);
            if (differenz > maxDiff) {
                maxDiff = differenz;
                feld1 = k;
                feld2 = k + 1;
            }
        }
        System.out.println("Die max. Differenz von " + maxDiff + " tritt auf zwischen feld[" + feld1 + "] und feld[" + feld2 + "].");
    }
}
