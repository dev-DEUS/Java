import javax.swing.JPanel;
import java.awt.*;

public class PuzzlePanel extends JPanel {
    private int dim;
    private ZahlButton[][] teile;
    private Schiebepuzzle parent;

    public PuzzlePanel(Schiebepuzzle parent, int n) {
        this.parent = parent;
        this.dim = n;
        this.teile = new ZahlButton[n][n];
        /* Aufgabenteil (a) */
        int temp = 1;
        for (int i = 0; i < teile.length; i++) {
            for (int j = 0; j < teile[i].length; j++) {
                if (temp <= 15) {
                    teile[i][j] = new ZahlButton(temp++);
                    this.add(teile[i][j]);
                } else {
                    teile[i][j] = new ZahlButton();
                    this.add(teile[i][j]);
                }
            }
        }
        mischen();
        this.setLayout(new GridLayout(n, n));
    }

    private void mischen() {
        /* Aufgabenteil (b) */
        for (int i = 0; i < 50; i++) {
            int zeile1 = (int) (Math.random() * 4);
            int spalte1 = (int) (Math.random() * 4);

            int zeile2 = (int) (Math.random() * 4);
            int spalte2 = (int) (Math.random() * 4);

            teile[zeile1][spalte1].tauscheMit(teile[zeile2][spalte2]);
        }
    }

    public ZahlButton checkLeerteilNachbar(ZahlButton zb) {
        /* Aufgabenteil (c) */
        for (int i = 0; i < teile.length; i++) {
            for (int j = 0; j < teile[i].length; j++) {
                if (teile[i][j] == zb) {
                    if (i > 0) { // Oben
                        if (teile[i - 1][j].istLeerfeld()) {
                            return teile[i - 1][j];
                        }
                    }
                    if (i < teile.length - 1) { // Unten
                        if (teile[i + 1][j].istLeerfeld()) {
                            return teile[i + 1][j];
                        }
                    }

                    if (j > 0) { // Links
                        if (teile[i][j - 1].istLeerfeld()) {
                            return teile[i][j - 1];
                        }
                    }

                    if (j < teile[i].length - 1) { // Rechts
                        if (teile[i][j + 1].istLeerfeld()) {
                            return teile[i][j + 1];
                        }
                    }
                }
            }
        }

        return null; // kein Leerteil als Nachbar gefunden
    }

    public boolean fertig() {
        /* Aufgabenteil (d) */
        boolean korrekteReihenfolge = true;
        int temp = 1;

        if (!(teile[0][0].istLeerfeld() || teile[3][3].istLeerfeld())) {
            korrekteReihenfolge = false;
        }
        
        for (int i = 0; i < teile.length; i++) {
            for (int j = 0; j < teile[i].length; j++) {
                if (!teile[i][j].istLeerfeld()) {
                    if (teile[i][j].getZahl() != temp) {
                        korrekteReihenfolge = false;
                        break;
                    }
                    temp++;
                }
            }
        }
        return korrekteReihenfolge;
    }

    /*
     * public Methoden, die Anfragen nach Informationen von der Klasse
     * ZahlButton beantworten oder weiterleiten an die Klasse Schiebepuzzle
     * sowie Methoden, die ein Update der Oberflaeche (nach einem Zug oder fuer
     * ein neues Spiel) durchfuehren.
     */

    /* liefert die Anzahl der Zuege von Hauptframe */
    public int getAnzahlZuege() {
        return parent.getAnzahlZuege();
    }

    /* veranlasst die Erhoehung des Zaehlers und ein Neuzeichnen */
    public void update() {
        parent.erhoeheZugZaehler();
        this.repaint();
    }

    /*
     * veranlasst, dass der Zaehlerwert zurueckgesetzt wird und mischt die
     * Puzzleteile neu
     */
    public void neuesSpiel() {
        parent.resetZugZaehler();
        this.mischen();
    }

}
