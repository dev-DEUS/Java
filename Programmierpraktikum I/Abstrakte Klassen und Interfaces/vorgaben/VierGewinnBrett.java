public class VierGewinnBrett extends Spielbrett {

    public VierGewinnBrett(int anzSpalten, int anzZeilen) {
        super(anzSpalten, anzZeilen);
        this.anzSpalten = anzSpalten;
        this.anzZeilen = anzZeilen;
    }

    public void zeichnen() {
        super.zeichnen();

        // Gibt die Spaltennummern darunter aus
        for (int spalte = 1; spalte <= anzSpalten; spalte++) {
            System.out.print(spalte + " ");
        }
        System.out.println();
    }

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
        for (int i = 0; i < belegung.length; i++) {
            for (int j = 0; j < belegung[i].length; j++) {

                // Prueft, ob an der Stelle [i][j] ein Spielstein liegt.
                // Wenn ja, dann pruefen wir mit diesem Stein ob eine Gewinnsituation vorliegt.
                if (belegung[i][j] != null) {
                    Spielstein aktuellerStein = belegung[i][j];

                    // Horizontale Pruefung
                    if (j + 3 < belegung[i].length) {
                        if (belegung[i][j + 1] != null && belegung[i][j + 2] != null && belegung[i][j + 3] != null) {
                            if (belegung[i][j + 1].gleicherSpieler(aktuellerStein) &&
                                    belegung[i][j + 2].gleicherSpieler(aktuellerStein) &&
                                    belegung[i][j + 3].gleicherSpieler(aktuellerStein)) {
                                return aktuellerStein.getSpieler();
                            }
                        }
                    }

                    // Vertikale Pruefung
                    if (i + 3 < belegung.length) {
                        if (belegung[i + 1][j] != null && belegung[i + 2][j] != null && belegung[i + 3][j] != null) {
                            if (belegung[i + 1][j].gleicherSpieler(aktuellerStein) &&
                                    belegung[i + 2][j].gleicherSpieler(aktuellerStein) &&
                                    belegung[i + 3][j].gleicherSpieler(aktuellerStein)) {
                                return aktuellerStein.getSpieler();
                            }
                        }
                    }

                    // Diagonale, links unten nach rechts oben Pruefung
                    if (i + 3 < belegung.length && j + 3 < belegung.length) {
                        if (belegung[i + 1][j + 1] != null && belegung[i + 2][j + 2] != null
                                && belegung[i + 3][j + 3] != null) {
                            if (belegung[i + 1][j + 1].gleicherSpieler(aktuellerStein) &&
                                    belegung[i + 2][j + 2].gleicherSpieler(aktuellerStein) &&
                                    belegung[i + 3][j + 3].gleicherSpieler(aktuellerStein)) {
                                return aktuellerStein.getSpieler();
                            }
                        }
                    }

                    // Diagonale, links oben nach rechts unten Pruefung
                    if (i - 3 >= 0 && j + 3 < belegung.length) {
                        if (belegung[i - 1][j + 1] != null && belegung[i - 2][j + 2] != null
                                && belegung[i - 3][j + 3] != null) {
                            if (belegung[i - 1][j + 1].gleicherSpieler(aktuellerStein) &&
                                    belegung[i - 2][j + 2].gleicherSpieler(aktuellerStein) &&
                                    belegung[i - 3][j + 3].gleicherSpieler(aktuellerStein)) {
                                return aktuellerStein.getSpieler();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public boolean hinzufuegen(Spieler spieler, int spalte, int zeile) {
        if (spalte < 1 || spalte > belegung[0].length) {
            return false;
        }

        for (int i = 0; i < belegung.length; i++) {
            if (belegung[i][spalte - 1] == null) {
                belegung[i][spalte - 1] = new Spielstein(spieler);
                return true;
            }
        }

        return false;
    }

    public boolean entfernen(Spieler spieler, int spalte, int zeile) {
        return false;
    }

    public boolean bewegen(Spieler spieler, int vonSpalte, int vonZeile, int nachSpalte, int nachZeile) {
        return false;
    }

}
