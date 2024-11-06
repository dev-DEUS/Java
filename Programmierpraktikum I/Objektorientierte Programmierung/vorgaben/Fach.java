public class Fach {
    private String name;
    private float note;

    // Getter fuer den Namen des Fachs
    public String getName() {
        return name;
    }

    // Getter fuer die Note des Fachs
    public float getNote() {
        return note;
    }

    // Setter fuer die Note des Fachs
    public void setNote(float note) {
        this.note = note;
    }

    // Konstruktor, der den Namen des Fachs initialisiert
    public Fach(String name) {
        this.name = name;
    }

    // Gibt eine Zeichenkette zurueck, die den Namen und die Note formatiert darstellt
    private String toString(int zeilenLaenge) {
        String noteString = umwandeln();
        String formatString = "%-" + (zeilenLaenge - noteString.length()) + "s%s";
        return String.format(formatString, name, noteString);
    }

    // Wandelt die numerische Note in eine verbale Beschreibung um
    private String umwandeln() {
        int gerundeteNote = Math.round(note);

        if (gerundeteNote < 1 || gerundeteNote > 6) {
            return "--";
        } else if (gerundeteNote == 1) {
            return "sehr gut";
        } else if (gerundeteNote == 2) {
            return "gut";
        } else if (gerundeteNote == 3) {
            return "befriedigend";
        } else if (gerundeteNote == 4) {
            return "ausreichend";
        } else if (gerundeteNote == 5) {
            return "mangelhaft";
        } else {
            return "ungenuegend";
        }
    }

    // Gibt die Standard-String-Darstellung des Fachs zurueck
    public String toString() {
        return toString(50);
    }
}
