import java.sql.Date;
import java.text.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

public class Termin {
    private LocalDateTime zeit; /*
                                 * Datums-Object für den Zeitpunkt
                                 * an dem der Termin beginnt
                                 */
    private Duration dauer; /* Dauer des Termins in Millisekunden */
    private String todo; /* (Kurz-)Beschreibung des Termins */

    /*
     * Default-Konstruktor für ein "leeres" Terminobjekt.
     * Von aussen soll nur ein Termin mit konkreten Daten-Parametern
     * generiert werden.
     */
    private Termin() {

    }

    /* *** Aufgabenteil (a) *** */
    public Termin(String datum, String uhrzeit, String beschreibung) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        LocalDateTime zeit = LocalDateTime.parse(datum + " " + uhrzeit, format);
        this.zeit = zeit;
    }
    /* *** Aufgabenteil (b) *** */

    public Object clone() {
        Termin termin = new Termin();
        termin.zeit = LocalDateTime.of(zeit.getYear(), zeit.getMonth(), zeit.getDayOfMonth(), zeit.getHour(),
                zeit.getMinute());
        termin.dauer = Duration.ofMillis(dauer.toMillis());
        termin.todo = new String(todo);
        return termin; // Dummy Return, muss ersetzt werden
    }

    /* *** Aufgabenteil (c) *** */

    /* *** Aufgabenteil (d) *** */

    /* *** Aufgabenteil (e) *** */

}
