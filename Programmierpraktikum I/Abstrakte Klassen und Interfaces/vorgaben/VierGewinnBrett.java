public class VierGewinnBrett extends Spielbrett {

    public boolean zugMoeglich(Spieler spieler) {
        for (int i = 0; i < belegung.length; i++) {
            for (int j = 0; j < belegung[i].length; j++) {
                if (belegung[i][j] == null) {
                    return true; // Gibt true zurueck, wenn es ein Feld mit keiner Belegung gibt
                }
            }
        }
        return false;

    }

    public Spieler gewinnsituation() {
        
        return null;
    }

    public boolean hinzufuegen(Spieler spieler, int spalte, int zeile) {
        // TODO Auto-generated method stub
        return false;
    }
}
