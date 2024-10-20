public class ZeugnisSchreiber {
    public static void schreiben(Schueler schueler) {
        System.out.println("ZEUGNIS\n");
        System.out.println("Name: " + schueler.getName() + "\n");

        Fach[] faecher = schueler.getFaecher();
        double summe = 0.0;
        for (int i = 0; i < faecher.length; i++) {
            System.out.println(faecher[i].toString());
            summe += faecher[i].getNote();

        }
        double durchschnitt = summe / faecher.length;

        if (durchschnitt <= 1.3) {
            System.out.println("\nDer Schueler erhaelt eine Auszeichnung fuer im\nDurchschnitt sehr gute Noten.\n");
        }
    }

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
