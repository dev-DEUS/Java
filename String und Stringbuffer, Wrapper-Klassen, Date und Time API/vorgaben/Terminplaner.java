import java.time.Duration;

/**
 * Testklasse zum Testen der Klasse Termin
 */
public class Terminplaner {
    public static void main(String[] args) {

        /* *** Aufgabenteil (f) *** */
        Termin termin1 = new Termin("05.09.2024", "12:00", "Vorlesung PP1", 90);
        Termin[] terminSerie = Termin.serieGenerieren(termin1, 14, 7);
        for (int i = 0; i < terminSerie.length; i++) {
            if (i == 4) {
                terminSerie[i].verschieben(-1, "Tag");
                System.out.println((i + 1) + ". " + terminSerie[i]);
            } else {
                System.out.println((i + 1) + ". " + terminSerie[i]);
            }
        }

        Termin termin2 = new Termin("03.12.2024", "15:00", "Zahnarzt", 60);
        System.out.println(termin2); // Termin vor der Verschiebung
        termin2.verschieben(6, "Woche"); // Um Wochen verschieben
        termin2.verschieben(-3, "Stunde"); // Um Stunden verschieben
        termin2.verschieben(-30, "Minute"); // Um Minuten verschieben
        System.out.println(termin2); // Nach der Verschiebung

    }
}
