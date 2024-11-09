public class VierGewinntSpiel extends Spiel {
    public VierGewinntSpiel() {
        super(2, new VierGewinnBrett(7, 6), 42);
    }

    public void ziehen(Spieler spieler) {
        VierGewinnBrett spielBrett = (VierGewinnBrett) this.brett;
        int spalten = 0;

        do {
            spalten = IOTools.readInteger("Spalte eingeben: ");
        } while ((spalten < 1 || spalten > 7) && !spielBrett.hinzufuegen(spieler, spalten, -1));
    }

    public static void main(String[] args) {
        VierGewinntSpiel spiel = new VierGewinntSpiel();
        spiel.spielen();
    }
}
