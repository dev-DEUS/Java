public class Rekursion1 {

    public static void r(int n, int k) {
        if (n > 1) {
            if ((n % k) == 0) {
                System.out.print(k + " ");
                n /= k;
            } else {
                k++;
            }
            r(n, k);
        }
    }

    public static void f(int n) {
        r(n, 2);
        System.out.println();
    }

    /* Aufgabenteil (c) */
    public static void f(int n, int k) {
        while (n > 1) {
            if ((n % k) == 0) {
                System.out.print(k + " ");
                n /= k;
            } else {
                k++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = IOTools.readInteger("n = ");
        f(n);
        f(n, 2); // Aufruf der Aufgabe c)
    }
}

/*
 * Aufgabenteil (a)
 * Ausgabe: 2 3 3 7 13
 * Aufrufhierachie:
 * r(21294, 2) -> r(10647, 2) -> r(10647, 3) -> r(3549, 3) -> r(1183, 3) ->
 * r(1183, 7) -> r(169, 7) -> r(169, 13) -> r(13, 13) -> r(1, 13)
 * Die Methode r ruft die Primfaktoren von n
 * rekursiv auf, und berechnet und gibt sie am Ende aus. Der Startwert für k ist
 * immer 2, und bei jedem
 * rekursiven Aufruf wird geprüft, ob n durch k teilbar ist. Wenn ja, wird k
 * ausgegeben und n durch k geteilt. Wenn nicht, wird k um 1 erhöht und weiter
 * geprueft.
 */

/*
 * Aufgabenteil (b)
 * Die Methode f(int n) gibt alle Primfaktoren von n aus.
 * Diese werden jeweils durch ein ein Leerzeichen getrennt.
 * Der Algorithmus funktioniert rekursiv und prueft, ob n durch k teilbar ist.
 * Wenn ja, wird k ausgegeben und n durch k geteilt. Ansonsten wird k
 * inkrementiert, um den nächsten möglichen Teiler zu testen. Der Prozess
 * wird bis n == 1 durchgefuehrt.
 */
