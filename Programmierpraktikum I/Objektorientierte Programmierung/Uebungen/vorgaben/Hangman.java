public class Hangman{
    private String geheim;
    private int count = 10; // max. Anzahl Versuche (wird runtergezaehlt)
    private String geraten; // Ratewort (zu Begin nur '-')
    private String guesses; // speichert bereits ausprobierte Buchstaben
    // Default-Initialisierung für den Fall, dass Datei words.txt fehlt
    private String[] words = {"Schifffahrt", "Klassenfahrt", "Pseudozufallszahlengenerator", "Konzertkarten", "Schauspieler", "Generalvollmacht","Passagier"};


    // geheimes Wort setzen
    // geratenes Wort mit Luecken initialisieren
    // geratene Buchstaben initialisieren
    public Hangman(){
	words = WGetter.getAllWords(); // Woerter laden
	geheim = getWord();            // Auswahl des Worts
	geraten = "";
	for (int i=0;i<geheim.length();i++){
	    geraten += "-";            // initial ------- (1 je Buchstabe)
	}
	guesses = "";                  // Speicher fuer Rateversuche
    }

    // zufaellige Auswahl eines Worts
    private String getWord(){
	int r = (int)(Math.random() * words.length);
	return words[r];
    }

    // Aufgabe: Methode play implemenieren und 
    // dabei ggf. weitere Methoden hinzufuegen
    public void play(){
	Hangman hm = new Hangman();
	StringBuffer geraten = new StringBuffer(hm.geraten);
	String buchstabe = "";
	geheim = hm.geheim;
	guesses = hm.guesses;

	boolean alive = true;
	
	while (alive) {

	    boolean found = false;
	    
	    if (count > 0) {
		System.out.println("\nNoch " + count + " Fehlversuche.\n");
		System.out.println(geraten);
		buchstabe = IOTools.readString("\nBuchstabe: ");
	    } else {
		System.out.println(geraten);
		System.out.println("\nVerloren.");
		alive = false;
	    }

	     

	    for (int i = 0; i < geheim.length(); i++) {
		if (geheim.charAt(i) == buchstabe.charAt(0)) {
		    geraten.setCharAt(i, buchstabe.charAt(0));
		    found = true;
		} 
	    }

	    if (!found && alive) {
		guesses += buchstabe.charAt(0) + "";
		count--;
		System.out.println("\nDer Buchstabe " + buchstabe + " kommt nicht vor.");
		System.out.println("Folgende Buchstaben kommen nicht vor: " + guesses);
	    }

	    if (geheim.equals(geraten)) {
		System.out.println("\nGewonnen! Herzlichen Glückwunsch!");
		alive = false;
	    }

	    
	}
	
        
    }

    public static void main(String[] args){
	Hangman hm = new Hangman();
	hm.play();
    }
}
