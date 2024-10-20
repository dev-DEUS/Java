public class Schueler {
    private String name;
    private Fach[] fach;

    public String getName() {
        return name;
    }

    public Fach[] getFaecher() {
        return fach;
    }

    public Schueler(String name, String[] faecherNamen) {
        this.name = name;
        this.fach = new Fach[faecherNamen.length];

        for (int i = 0; i < faecherNamen.length; i++) {
            this.fach[i] = new Fach(faecherNamen[i]);
        }
    }

    public void erfasseErgebnisse() {
        double notenWerte;
        for (int i = 0; i < fach.length; i++) {
            do {
                notenWerte = IOTools.readDouble("Note fuer " + fach[i].getName() + ": ");
            } while (notenWerte < 1 || notenWerte > 6);

            fach[i].setNote((float) notenWerte);
        }
    }
}
