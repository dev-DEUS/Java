import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
import java.util.Locale;

public class TerminverwaltungJ8 {
    LocalDateTime[] termine;

   
    private static int randomMinMax(int min, int max){
	return (int)(Math.random() * (max-min+1)) +  min;
    }


    private static LocalDateTime createRandomTermin(){
        int jahr = LocalDate.now().getYear();
        int rDays = (int)(Math.random() * 366);
        int stunde = randomMinMax(9,16);
        int minute = randomMinMax(0,3)*15;
        return LocalDateTime.of(jahr,1,1,stunde,minute).plusDays(rDays);
    }
    
     
    public TerminverwaltungJ8 (int n){
	termine = new LocalDateTime[n];
	for (int i=0;i<termine.length;i++){
	    termine[i] = createRandomTermin();
	}
    }  

    private int getKW(LocalDateTime termin){
	return termin.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR);

	/* mit Locale */
	//TemporalField tf = WeekFields.of(Locale.GERMANY).weekOfWeekBasedYear();
	//return termin.get(tf);

    }

    /* ******************************************************* */
    /* Methoden ergaenzen */
    
    // Einzelnen Termin generieren
    public static LocalDateTime createTermin(int monat, int tag, int stunde, int minute) {
	return LocalDateTime.of(2024, monat, tag, stunde, minute);
    }
    
    // Einzelnen Termin formatieren
    public String formatTermin(LocalDateTime termin) {
        int kw = getKW(termin);
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd. MMMM, HH:mm,");

	String terminFormatted = termin.format(format);
	return terminFormatted + " (KW " + kw + ")";
    }
    
    // Termine in KW k (k = 1-52)
    public LocalDateTime[] getTerminInKW(int kw) {
        int count = 0;

	for (int i = 0; i < termine.length; i++) {
	    if (getKW(termine[i]) == kw) {
		count++;
	    }
	}

	LocalDateTime[] termineInKW = new LocalDateTime[count];
	int index = 0;
	for (int i = 0; i < termine.length; i++) {
	    if (getKW(termine[i]) == kw) {
		termineInKW[index++] = termine[i];
	    }
	}

	return termineInKW;
    }
	
    // alle Daten zwischen t1 und t2
    public LocalDateTime[] getTermineZwischen(LocalDateTime t1, LocalDateTime t2) {
	int count = 0;

	for (int i = 0; i < termine.length; i++) {
	    if ((termine[i].isAfter(t1) || termine[i].isEqual(t1)) && (termine[i].isBefore(t2) || termine[i].isEqual(t2))) {
		count++;
	    }
	}

	LocalDateTime[] termineZwischen = new LocalDateTime[count];
	int index = 0;

        for (int i = 0; i < termine.length; i++) {
	    if ((termine[i].isAfter(t1) || termine[i].isEqual(t1)) && (termine[i].isBefore(t2) || termine[i].isEqual(t2))) {
	        termineZwischen[index++] = termine[i];
	    }
	}

	return termineZwischen;
    }
    
    // Termine vom nächsten Tag an (0:00) bis anzTage darauf bestimmen
    public LocalDateTime[] getTermineNaechsteTage(int k) {
	int count = 0;
	LocalDateTime heute = LocalDateTime.now();
	LocalDateTime endDatum = heute.plusDays(k);
	    
	for (int i = 0; i < termine.length; i++) {
	    if ((termine[i].isAfter(heute) || termine[i].isEqual(heute)) && (termine[i].isBefore(endDatum) || termine[i].isEqual(endDatum))) {
		count++;
	    }
	}

	LocalDateTime[] termineZwischen = new LocalDateTime[count];
	int index = 0;
	for (int i = 0; i < termine.length; i++) {
	    if ((termine[i].isAfter(heute) || termine[i].isEqual(heute)) && (termine[i].isBefore(endDatum) || termine[i].isEqual(endDatum))) {
	        termineZwischen[index++] = termine[i];
	    }
	}

	return termineZwischen;
    }

    
    // Test
    public static void main(String[] args){
	int n = 25;
	// TerminverwaltungJ8 mit 25 Terminen anlegen
	TerminverwaltungJ8 tv = new TerminverwaltungJ8(n);

	// Alle Termine ausgeben
	System.out.println(">>>>>>>>Alle Termine: ");
	for (int i = 0; i < tv.termine.length; i++) {
	    System.out.println(tv.formatTermin(tv.termine[i]));
	}
	
	// Termine in KW 12 ausgeben
	System.out.println("\n>>>>>>>>Termine in KW 12: ");
	LocalDateTime[] termineInKW = tv.getTerminInKW(12);
	
	for (int i = 0; i < termineInKW.length; i++) {
	    System.out.println(tv.formatTermin(termineInKW[i]));
	}

	// Termine zwischen 1.5. und 5.6. ausgeben
	System.out.println("\n>>>>>>>>Termine zwischen 12.5 und 5.6.: ");
	LocalDateTime t1 = LocalDateTime.of(2024, 5, 12, 0, 0);
	LocalDateTime t2 = LocalDateTime.of(2024, 6, 5, 0, 0);
	LocalDateTime[] termineZwischen = tv.getTermineZwischen(t1, t2);

	for (int i = 0; i < termineZwischen.length; i++) {
	    System.out.println(tv.formatTermin(termineZwischen[i]));
	}
	

	// Termine in den nächsten 7 Tagen ausgeben
	System.out.println("\n>>>>>>>>Termine in den nächsten 7 Tagen: ");
	LocalDateTime[] termineTage = tv.getTermineNaechsteTage(7);

	for (int i = 0; i < termineTage.length; i++) {
	    System.out.println(tv.formatTermin(termineTage[i]));
	}
    }
}
