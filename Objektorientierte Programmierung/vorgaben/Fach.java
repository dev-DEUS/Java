public class Fach {
    private String name;
    private float note;

    public String getName() {
        return name;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public Fach(String name) {
        this.name = name;
    }

    private String toString(int zeilenLaenge) {
        String noteString = umwandeln();
        String formatString = "%-" + (zeilenLaenge - noteString.length()) + "s%s";
        return String.format(formatString, name, noteString);
    }

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

    public String toString() {
        return toString(50);
    }

}
