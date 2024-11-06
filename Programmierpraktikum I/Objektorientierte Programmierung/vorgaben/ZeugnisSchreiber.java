public class ZeugnisSchreiber {
    // Methode zum Schreiben des Zeugnisses eines Schuelers
    public static void schreiben(Schueler schueler) {
        System.out.println("ZEUGNIS\n");
        System.out.println("Name: " + schueler.getName() + "\n");

        Fach[] faecher = schueler.getFaecher();
        double summe = 0.0;
        for (int i = 0; i < faecher.length; i++) {
            System.out.println(faecher[i].toString()); // Gibt das Fach mit Note aus
            summe += faecher[i].getNote(); // Summiert die Noten
        }
        double durchschnitt = summe / faecher.length; // Berechnet den Durchschnitt

        // Prueft, ob der Schueler eine Auszeichnung erhaelt
        if (durchschnitt <= 1.3) {
            System.out.println("\nDer Schueler erhaelt eine Auszeichnung fuer im\nDurchschnitt sehr gute Noten.\n");
        }
    }

    // Main-Methode zum Testen der ZeugnisSchreiber-Klasse
    public static void main(String[] args) {
        String name = IOTools.readString("Name des Schuelers: ");
        String[] faecher = { "Mathematik", "Deutsch", "Latein", "Sport", "Naturwissenschaft" };
        Schueler schueler = new Schueler(name, faecher);
        schueler.erfasseErgebnisse();
        System.out.println("-------------------------------------------------------");
        schreiben(schueler);
        System.out.println("-------------------------------------------------------");
    }
}
