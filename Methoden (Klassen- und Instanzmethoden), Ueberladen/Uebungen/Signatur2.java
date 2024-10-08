// Aufgabe 1
public class Signatur2 {
    public static void tuWas(int x, int y, double z) {
        System.out.println("iid");
    }

    public static void tuWas(int x, double y, int z) {
        System.out.println("idi");
    }

    public static void main(String[] args) {
        int a = 123;
        double b = 4.56;
        // Beide Metoden wuerden funktionieren. Da jedoch bei beiden Methoden eine Typumwandlung stattfindet, weißt der Compiler nicht
        // welche es nutzen soll. Wenn die Methode aufgerufen wird, erhalten wir einen "ambiguous" Fehlermeldung, welches auf die Mehrdeutigkeit
        // aufmerksam macht.
        // tuWas(a, a, a);
    }
}