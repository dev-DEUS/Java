import java.sql.Date;
import java.text.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
import java.util.Locale;

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
    public Termin(String datum, String uhrzeit, String beschreibung, int dauer) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        LocalDateTime zeit = LocalDateTime.parse(datum + " " + uhrzeit, format);
        this.zeit = zeit;
        this.dauer = Duration.ofMinutes(dauer);
        this.todo = beschreibung;
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
    public String toString() {
        StringBuffer sbuf = new StringBuffer();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, dd.MM.yyyy HH:mm").withLocale(Locale.GERMAN);

        String beginn = format.format(zeit);
        LocalDateTime endzeit = zeit.plus(dauer);
        String ende = format.format(endzeit);

        sbuf.append("Termin: ").append(todo).append("\n").append(String.format("Beginn: %s h", beginn)).append("\n")
                .append(String.format("%-7s %s h", "Ende:", ende)).append("\n");

        return sbuf.toString();
    }

    /* *** Aufgabenteil (d) *** */
    public static Termin[] serieGenerieren(Termin muster, int n, int k) {
        Termin[] termine = new Termin[n];

        for (int i = 0; i < n; i++) {
            Termin kopTermin = (Termin) muster.clone();
            kopTermin.zeit = kopTermin.zeit.plusDays(i * k);
            termine[i] = kopTermin;
        }
        return termine;
    }

    /* *** Aufgabenteil (e) *** */
    public void verschieben(int anzahl, String einheit) {
        ChronoUnit chronoUnit;

        switch (einheit) {
            case "Woche":
                chronoUnit = ChronoUnit.WEEKS;
                break;
            case "Tag":
                chronoUnit = ChronoUnit.DAYS;
                break;
            case "Stunde":
                chronoUnit = ChronoUnit.HOURS;
                break;
            case "Minute":
                chronoUnit = ChronoUnit.MINUTES;
                break;
            default:
                return;
        }

        this.zeit = this.zeit.plus(anzahl, chronoUnit);
    }

}
