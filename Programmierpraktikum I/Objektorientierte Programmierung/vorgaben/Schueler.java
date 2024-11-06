public class Schueler {
    private String name;
    private Fach[] fach;

    // Getter fuer den Namen des Schuelers
    public String getName() {
        return name;
    }

    // Getter fuer die Faecher des Schuelers
    public Fach[] getFaecher() {
        return fach;
    }

    // Konstruktor, der den Namen des Schuelers und die Faecher initialisiert
    public Schueler(String name, String[] faecherNamen) {
        this.name = name;
        this.fach = new Fach[faecherNamen.length];

        // Initialisiert jedes Fach mit dem entsprechenden Namen
        for (int i = 0; i < faecherNamen.length; i++) {
            this.fach[i] = new Fach(faecherNamen[i]);
        }
    }

    // Methode zur Erfassung der Noten fuer die Faecher des Schuelers
    public void erfasseErgebnisse() {
        double notenWerte;
        for (int i = 0; i < fach.length; i++) {
            do {
                // Liest die Note fuer das Fach ein, solange sie zwischen 1 und 6 liegt
                notenWerte = IOTools.readDouble("Note fuer " + fach[i].getName() + ": ");
            } while (notenWerte < 1 || notenWerte > 6);

            // Setzt die Note fuer das Fach
            fach[i].setNote((float) notenWerte);
        }
    }
}
