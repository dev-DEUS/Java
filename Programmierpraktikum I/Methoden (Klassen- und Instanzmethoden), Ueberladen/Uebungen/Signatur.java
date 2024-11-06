// Aufgabe 1
public class Signatur {
    public static void tuWas(int x, int y, int z) {
        System.out.println("iii");
    }

    public static void tuWas(int x, int y, double z) {
        System.out.println("iid");
    }

    public static void tuWas(int x, double y, double z) {
        System.out.println("idd");
    }

    public static void tuWas(double x, int y, double z) {
        System.out.println("did");
    }

    public static void main(String[] args) {
        int a = 123;
        double b = 4.56;
        tuWas(a, a, a); // Gueltig. Ausgabe: iii
        tuWas(a, a, b); // Gueltig. Ausgabe: iid
        tuWas(a, b, a); // Gueltig: Ausgabe: idd
        tuWas(a, b, b); // Gueltig. Ausgabe: idd
        // tuWas(b, b, b); // Ungueltig. Es ist nicht erlaubt einem integer einen double zu uebergeben.
        tuWas(b, a, b); // Gueltig. Ausgabe: did
        tuWas(b, a, a); // Gueltig. Ausgabe: did
    }
}