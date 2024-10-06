public class Wuerfel {
    public static int max = 6;  // maximale Augenzahl auf dem Wuerfel
    public int nr;
    public int wert;
    public static int aktuelleNr = 1;

    /* *** Aufgabenteil (a) *** */
    public Wuerfel() {
        wert = 1;
        nr = aktuelleNr++;
    }

    public void print() {
        System.out.println("Wuerfel Nr. " + nr + " -> " + wert);
    }

    public void werfen() {
        wert = (int) (Math.random() * max) + 1;
    }
}
